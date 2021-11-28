package Task_2;

import java.util.ArrayList;

public class CompositeOlympics implements OlympicsTeams{
	private String name;
	private int numberOfAthletes;
	private int numberOfGoldMedals;
	
	private ArrayList <CompositeContinent> teamsByContinent;
	
	public CompositeOlympics (String name, int numberOfAthletes, int numberOfGoldMedals) {
		this.name = name;
		this.numberOfAthletes = numberOfAthletes;
		this.numberOfGoldMedals = numberOfGoldMedals;
		this.teamsByContinent = new ArrayList<CompositeContinent>();
	}
	public void addOlympicsTeams (CompositeContinent t) {
		teamsByContinent.add(t);
	}
	public void removeOlympicsTeams (CompositeContinent t) {
		teamsByContinent.remove(t);
	}
	public void printInfo() {
		System.out.println(name);
		teamsByContinent.forEach(CompositeContinent::printInfo);
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
	public ArrayList<CompositeContinent> getTeamsByContinent() {
		return teamsByContinent;
	}
	public void setTeamsByContinent(ArrayList<CompositeContinent> teamsByContinent) {
		this.teamsByContinent = teamsByContinent;
	}

	
	

	
	
}