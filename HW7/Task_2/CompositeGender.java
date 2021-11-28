package Task_2;

import java.util.ArrayList;

public class CompositeGender implements OlympicsTeams {
	private String name;
	private int numberOfAthletes;
	private int numberOfGoldMedals;
	
	private ArrayList <SportType> teamsBySportType;
	
	public CompositeGender (String name, int numberOfAthletes, int numberOfGoldMedals) {
		this.name = name;
		this.numberOfAthletes = numberOfAthletes;
		this.numberOfGoldMedals = numberOfGoldMedals;
		this.teamsBySportType = new ArrayList<SportType>();
	}
	public void addOlympicsTeams (SportType t) {
		teamsBySportType.add(t);
	}
	public void removeOlympicsTeams (SportType t) {
		teamsBySportType.remove(t);
	}
	public void printInfo() {
		System.out.println(name);
		teamsBySportType.forEach(OlympicsTeams::printInfo);
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
	public ArrayList<SportType> getTeamsBySportType() {
		return teamsBySportType;
	}
	public void setTeamsBySportType(ArrayList<SportType> teamsBySportType) {
		this.teamsBySportType = teamsBySportType;
	}

	
	

	
	
}
