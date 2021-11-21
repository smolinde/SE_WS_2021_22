import java.util.Scanner;
public class Game_Chair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Generate 2 players, Computer and Player 2 (you).");
		Player p1 = new Player("Computer");
		Player p2 = new Player("Player 2");
		p1.start();
		System.out.println("Computer generated its's number...");
		p2.start();
		for (int i = 5; i > 0 ; i--) {
			boolean userSelected = false;
			boolean invalidInput = true;
			while (invalidInput) {
				invalidInput = true;
				System.out.println("Your current number is:\t" + p2.getCardNumber());
				System.out.println("Card picks left:\t" + i);
				System.out.println("Continue? [y/n]");
				String inputText = sc.nextLine();
				if (inputText.equals("y")) {
					invalidInput = false;
					p2.setCardNumber(BetMore_Game.play());
					System.out.println("Getting new card...");
				} else if (inputText.equals("n")) {
					invalidInput = false;
					userSelected = true;
					System.out.println("Final decision made...");
				} else {
					System.out.println("Invalid input!");
				}
			}
			if (userSelected) {break;}
		}
		sc.close();
		System.out.println("The winner is:\t" + BetMore_Game.winner(p1, p2).getName());
		System.out.println(p1.getName() + " had the number " + p1.getCardNumber());
		System.out.println(p2.getName() + " had the number " + p2.getCardNumber());
	}

}
