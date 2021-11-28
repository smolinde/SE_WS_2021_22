package Task_2;

import java.util.ArrayList;

public class CompositeContinent implements OlympicsTeams {
	private String name;
	private int numberOfAthletes;
	private int numberOfGoldMedals;
	
	private ArrayList <CompositeCountry> teamsByCountry;
	
	public CompositeContinent (String name, int numberOfAthletes, int numberOfGoldMedals) {
		this.name = name;
		this.numberOfAthletes = numberOfAthletes;
		this.numberOfGoldMedals = numberOfGoldMedals;
		this.teamsByCountry = new ArrayList<CompositeCountry>();
	}
	public void addOlympicsTeams (CompositeCountry t) {
		teamsByCountry.add(t);
	}
	public void removeOlympicsTeams (CompositeCountry t) {
		teamsByCountry.remove(t);
	}
	public void printInfo() {
		System.out.println(name + " (Gold Medals: " + numberOfGoldMedals + ")");
		teamsByCountry.forEach(CompositeCountry::printInfo);
	}

	public String getName() {
		return name;
	}

	public int getNumberOfAthletes() {
		return numberOfAthletes;
	}

	public int getNumberOfGoldMedals() {
		return numberOfGoldMedals;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setNumberOfAthletes(int numberOfAthletes) {
		this.numberOfAthletes = numberOfAthletes;
	}

	public void setNumberOfGoldMedals(int numberOfGoldMedals) {
		this.numberOfGoldMedals = numberOfGoldMedals;
	}
	public ArrayList<CompositeCountry> getTeamsByCountry() {
		return teamsByCountry;
	}
	public void setTeamsByCountry(ArrayList<CompositeCountry> teamsByCountry) {
		this.teamsByCountry = teamsByCountry;
	}

	
	

	
	
}