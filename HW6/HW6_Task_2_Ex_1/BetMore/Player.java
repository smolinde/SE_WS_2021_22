
public class Player {
	private int cardNumber;
	private String name;
	public Player (String name) {
		this.name = name;
	}
	public void start () {
		cardNumber = BetMore_Game.play();
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public String getName() {
		return name;
	}
	public void setCardNumber (int cardNumber) {
		this.cardNumber = cardNumber;
	}
}
