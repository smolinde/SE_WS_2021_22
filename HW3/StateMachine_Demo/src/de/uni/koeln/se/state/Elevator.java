package de.uni.koeln.se.state;
import java.util.Random;

public class Elevator{
	private static Random rnd = new Random();
	public static int current_Floor= rnd.nextInt(11);
	private int dest_Floor;
	private Elv_States State = new Elv_States();

	public Elevator (int dest_floor)
	{
		this.dest_Floor=dest_floor;
		System.out.println("*** Destination floor is: "+ dest_Floor);
		State.Current_State = State.Idle;
		arrive_atFloor();
	}
	private void go_up () {
		State.Current_State = State.Moving_up;
		System.out.println("Going up...");
		current_Floor++;
		proceed();
	}
	private void go_down() {
		State.Current_State = State.Moving_down;
		System.out.println("Going down...");
		current_Floor--;
		proceed();
	}
	private void arrive_to_floor () {
		State.Current_State = State.Idle;
		System.out.println("Applying brakes...");
		proceed();
	}
	private void proceed () {
		System.out.println("Current Floor: " + current_Floor);
		switch (State.Current_State) {
		case "Idle":
			if (current_Floor < dest_Floor) {
				go_up();
			} else if (current_Floor > dest_Floor) {
				go_down();
			} else if (current_Floor == dest_Floor) {
				System.out.println("Opening doors...");
				System.out.println("People leaving...");
				System.out.println("+---------------------------------+");
				System.out.println("|   Ride was endet successfully!  |");
				System.out.println("+---------------------------------+");
			}
			break;
		case "Moving_up":
			if (current_Floor < dest_Floor) {
				go_up();
			} else if (current_Floor == dest_Floor){
				arrive_to_floor();
			}
			break;
		case "Moving_down":
			if (current_Floor > dest_Floor) {
				go_down();
			} else if (current_Floor == dest_Floor) {
				arrive_to_floor();
			}
			break;
		}
	}
	private void arrive_atFloor() {
		System.out.println("Closing doors...");
		System.out.println("Arrived at floor " + current_Floor);
		System.out.println("Opening doors...");
	}
	public void startJourney() {
		System.out.println("People boarding...");
		System.out.println("Closing doors...");
		proceed();
	}
}
