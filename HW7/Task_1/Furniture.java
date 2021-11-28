package Task_1;

public class Furniture implements HouseholdItem{
	
	String name;
	String type;


	int lenght;
	int width;
	int height;
	
	int weight;

	
	public Furniture(String name, String type, int lenght, int width, int height, int weight) {
		this.name = name;
		this.type = type;
		this.lenght = lenght;
		this.width = width;
		this.height = height;
		this.weight = weight;
	}


	

//Getters and Setters



	public int getHeight() {
		return height;}

	public void setHeight(Integer height) {
		this.height = height;}

	public int getLenght() {
		return lenght;}

	public void setLenght(Integer lenght) {
		this.lenght = lenght;}

	public int getWidth() {
		return width;	}

	public void setWidth(Integer width) {
		this.width = width;}

	public int getWeight() {
		return weight;}

	public void setWeight(Integer weight) {
		this.weight = weight;}

	public String getType() {
		return type;}

	public void setType(String type) {
		this.type = type;}

	public String getName() {
		return name;}

	public void setName(String name) {
		this.name = name;}




	@Override
	public double movingCost() {
		return Math.round((weight * 0.25) * 100.0) / 100.0;
	}




	@Override
	public String packagingInstructions() {
		return "should be covered with waterproof covers with area of: " + lenght + "x" + width;
	}

	
}
