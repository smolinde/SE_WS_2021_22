
public class BetMore_Game {
	public static int play () {
		return Shuffle.pick_card();
	}
	public static Player winner (Player system, Player player_2) {
		if (system.getCardNumber() > player_2.getCardNumber()) {
			return system;
		} else if (system.getCardNumber() < player_2.getCardNumber()) {
			return player_2;
		} else {
			return new Player ("Nobody");
		}
		
	}
}
