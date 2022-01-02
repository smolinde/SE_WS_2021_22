package de.uni.koeln.se.main;
import java.util.Scanner;
import de.uni.koeln.se.state.Elevator;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Current Floor is " + Elevator.current_Floor); 
		int dest_floor = -1;
		while (dest_floor < 0 || dest_floor > 10) {
			System.out.println("Enter destination Floor: (0 to 10):");
			try {
				dest_floor = sc.nextInt();
				if (dest_floor < 0 || dest_floor > 10) {
					System.out.println("Error: Number is out of range!");
				}
			} catch (Exception e) {
				System.out.println("Error: Invalid input format!");
				sc.nextLine();
			}
		}
		sc.close();
		System.out.println("--------------------------------------------");
		Elevator elv=new  Elevator(dest_floor);
		elv.startJourney();
	}
}