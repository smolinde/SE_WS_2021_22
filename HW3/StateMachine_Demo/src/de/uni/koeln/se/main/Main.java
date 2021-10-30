package de.uni.koeln.se.main;

import java.util.Scanner; 

import de.uni.koeln.se.state.Elevator;
import de.uni.koeln.se.state.Elv_States;

public class Main {
	public static void main(String[] args) 
	{
		
		 Scanner in = new Scanner(System.in); 
		
		System.out.println("Current Floor is 5"); 

       
		System.out.println("Enter destination Floor: (0 to 10):"); 

		 int dest_floor = in.nextInt(); 
		 in.close();
		
		 System.out.println("--------------------------------------------");

		
		 Elevator elv=new  Elevator(dest_floor);

		
	}
	
	

}
