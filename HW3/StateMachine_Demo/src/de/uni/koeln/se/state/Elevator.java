package de.uni.koeln.se.state;
import java.util.Random;

public class Elevator{
	private static Random rnd = new Random();
	public static int current_Floor= rnd.nextInt(11);
	int dest_Floor;

	private Elv_States State = new Elv_States();

	public Elevator (int dest_floor)
	{
		this.dest_Floor=dest_floor;
		System.out.println("*** Destination floor is: "+ dest_Floor);
		arrive_atFloor();


	}

	private void arrive_atFloor() {

	}


}
