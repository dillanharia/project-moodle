package projectmoodle;

public class Game {
	
	public void start() {
		Player player = new Player("dillan", 100);
		
        player.addCard(new Card(101, "Bug Byte", Rarity.COMMON, 15));
        player.addCard(new Card(205, "Null Phantom", Rarity.RARE, 40));
        player.addCard(new Card(150, "Alpha Script", Rarity.COMMON, 20));
		
		
		System.out.println("Welcome to Project Moodle.");
        System.out.println("Player: " + player.getUsername());
        System.out.println("Credits: " + player.getCredits());
        player.displayOwnedCards();

	}
}
