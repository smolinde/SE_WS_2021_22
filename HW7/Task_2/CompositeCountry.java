package Task_2;


import java.util.ArrayList;

public class CompositeCountry implements OlympicsTeams{
	private String name;
	private int numberOfAthletes;
	private int numberOfGoldMedals;
	
	private ArrayList <CompositeGender> teamsByGender;
	
	public CompositeCountry (String name, int numberOfAthletes, int numberOfGoldMedals) {
		this.name = name;
		this.numberOfAthletes = numberOfAthletes;
		this.numberOfGoldMedals = numberOfGoldMedals;
		this.teamsByGender = new ArrayList<CompositeGender>();
	}
	public void addOlympicsTeams (CompositeGender t) {
		teamsByGender.add(t);
	}
	public void removeOlympicsTeams (CompositeGender t) {
		teamsByGender.remove(t);
	}
	public void printInfo() {
		System.out.println(name + " (Gold Medals: " + numberOfGoldMedals + ")");
		teamsByGender.forEach(CompositeGender::printInfo);
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
	public ArrayList<CompositeGender> getTeamsByGender() {
		return teamsByGender;
	}
	public void setTeamsByGender(ArrayList<CompositeGender> teamsByGender) {
		this.teamsByGender = teamsByGender;
	}

	
	

	
	
}
