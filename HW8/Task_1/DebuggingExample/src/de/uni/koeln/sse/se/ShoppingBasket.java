package Task_1.DebuggingExample.src.de.uni.koeln.sse.se;

import java.util.ArrayList;

public class ShoppingBasket {
	private Items item_list;
	private Integer totalPrice;
	

	ArrayList<String> MyItems=new ArrayList<String>();

	public ShoppingBasket() {
		item_list = new Items();
		totalPrice = 0;
	}
	
	public void addTobasket(String item) {
		

		setTotalPrice(getTotalPrice()+ item_list.getPrice(item));
			
		
	}
	
public Integer getBill() {
		
		return getTotalPrice();
		
		
	}

public  Integer getTotalPrice() {
	return totalPrice;
}

public  void setTotalPrice(Integer totalPrice) {
	this.totalPrice = totalPrice;
}

}
