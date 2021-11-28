package Task_2;

public class SportType implements OlympicsTeams{
	private String name;
	private int numberOfAthletes;
	private int numberOfGoldMedals;
	
	public SportType (String name, int numberOfAthletes, int numberOfGoldMedals) {
		this.name = name;
		this.numberOfAthletes = numberOfAthletes;
		this.numberOfGoldMedals = numberOfGoldMedals;
	}
	public void printInfo() {
		System.out.println(" Team: " + name + ", Number of Athletes: " + numberOfAthletes);
	}
	public String getName() {
		return name;
	}
	public int getNumberOfAthletes() {
		return numberOfAthletes;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumberOfAthletes(int numberOfAthletes) {
		this.numberOfAthletes = numberOfAthletes;
	}
	public int getNumberOfGoldMedals() {
		return numberOfGoldMedals;
	}
	public void setNumberOfGoldMedals(int numberOfGoldMedals) {
		this.numberOfGoldMedals = numberOfGoldMedals;
	}
	

}
