package projectmoodle;

public class Game {
	
	public void start() {
		System.out.println("Welcome to Project Moodle.");
		System.out.println("Game setup is in progress... ");
		
		Card card = new Card(101, "Boss Bandit", Rarity.COMMON, 10);
		System.out.println(card);
	}
}
