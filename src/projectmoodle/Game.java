package projectmoodle;

public class Game {
	
	public void start() {
		CardLibrary library = new CardLibrary();
		
		
		System.out.println("All cards in the game:");
        for (Card card : library.getAllCards()) {
        	System.out.println(card);
        }
	}
}
