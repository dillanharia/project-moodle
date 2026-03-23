package projectmoodle;

import java.util.Scanner;

public class Game {
	
	private Scanner scanner;
	private LoginService loginService;
	private CardLibrary cardLibrary;
	private Player currentPlayer;
	
	public Game() {
		scanner = new Scanner(System.in);
		loginService = new LoginService();;
		cardLibrary = new CardLibrary();
	}
	
	
	public void start() {
        System.out.println("Welcome to Project Moodle");
        System.out.println("Please log in to continue.");
        System.out.println();
        
        System.out.print("Username: ");
        String username = scanner.nextLine();
        
        System.out.print("Password: ");
        String password = scanner.nextLine();
        scanner.close();
        
        boolean loginSuccessful = loginService.authenticate(username,  password);
        
        if (!loginSuccessful) {
        	System.out.println();
        	System.out.println("Login failed. Exciting game.");
        	return;
        }
        
        currentPlayer = new Player(username, 100);
        
        Card starterCard = cardLibrary.getRandomCard();
        currentPlayer.addCard(starterCard);
        
        
        System.out.println();
        System.out.println("Login successful");
        System.out.println("Welcome, " + currentPlayer.getUsername() + "!");
        System.out.println("You have been given 100 credits");
        System.out.println("Your starter card is: " + starterCard);
        
	}
}
