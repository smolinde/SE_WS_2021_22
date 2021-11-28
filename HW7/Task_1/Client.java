package Task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client{
	
public static void main(String[] args) {
		

		//Initialise some household
		List<HouseholdItem> householdItmes= new ArrayList<>();

		
		Electronic microwaveOven= new Electronic("Microwave Oven",37, 48, 27, 13, false);
		Electronic tv= new Electronic("TV",122, 73, 15, 18, true);
		
		Glass wineGlass= new Glass("Wine glasses",33,28,23,1);
		Glass coffeeTable= new Glass("Glass Coffee Table ",80,80,45,3);

		
		Furniture bed= new Furniture("Bed", "Metal", 205, 91, 94, 26);
		Furniture cupboard= new Furniture("Bookshelf", "Wood", 60, 31, 190, 25);
		
		
        List<HouseholdItem> namesList = Arrays.asList(microwaveOven,tv,wineGlass,coffeeTable,bed,cupboard );
        householdItmes.addAll(namesList);
		
        for (int i = 0; i < namesList.size(); i++) {
        	System.out.println("Total Cost for " + namesList.get(i).getName() + " is: " + namesList.get(i).movingCost() + " Euros");
        }
        System.out.println();
        for (int i = 0; i < namesList.size(); i++) {
        	System.out.println(namesList.get(i).getName() + ":");
        	System.out.println(" > " + namesList.get(i).packagingInstructions());
        }
  
}

}
