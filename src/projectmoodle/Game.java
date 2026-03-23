package projectmoodle;

public class Game {
	
	public void start() {
        CardLibrary library = new CardLibrary();

        System.out.println("Welcome to Project Moodle");
        System.out.println("Your random test card is:");
        System.out.println(library.getRandomCard());
        
	}
}
