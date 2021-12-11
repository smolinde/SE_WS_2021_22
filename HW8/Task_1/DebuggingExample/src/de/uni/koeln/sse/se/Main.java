package Task_1.DebuggingExample.src.de.uni.koeln.sse.se;

public class Main {
	
	public static void main(String[] args) {
		
		//debuggingExercise1_2();
		
		debuggingExercise3();
				
	}

	
	public static  void debuggingExercise1_2() {

		
		ShoppingBasket johnShoppingBasket= new ShoppingBasket();
		johnShoppingBasket.addTobasket("Bread");
		johnShoppingBasket.addTobasket("Water");
	    System.out.println("john bill : " + johnShoppingBasket.getBill());
	    
	    ShoppingBasket saraShoppingBasket= new ShoppingBasket();
	    saraShoppingBasket.addTobasket("Pasta");
	    saraShoppingBasket.addTobasket("Milk");
	    System.out.println("sara bill : "+ saraShoppingBasket.getBill());
	    
		
	}
	
	

	public static void debuggingExercise3() {
		MonthPoem myMonth= new MonthPoem(Month.MAY);
		myMonth.PrintPoem();
		
		
	}

}
