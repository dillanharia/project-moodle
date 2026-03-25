package projectmoodle;

import java.util.Scanner;

public class Game {
	
	private Scanner scanner;
	private LoginService loginService;
	private Marketplace marketplace;
	private CardLibrary cardLibrary;
	private Player currentPlayer;
	
	public Game() {
		scanner = new Scanner(System.in);
		loginService = new LoginService();;
		cardLibrary = new CardLibrary();
		marketplace = new Marketplace(cardLibrary);
	}
	
	
	public void start() {
        System.out.println("Welcome to Project Moodle");
        System.out.println("Please log in to continue.");
        System.out.println();
        
        System.out.print("Username: ");
        String username = scanner.nextLine();
        
        System.out.print("Password: ");
        String password = scanner.nextLine();
        
        
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
        
        runMainMenu();
	}
	private void buyCard() {
	    if (marketplace.getAvailableCards().isEmpty()) {
	        System.out.println("There are no cards available to buy.");
	        return;
	    }

	    marketplace.displayAvailableCards();
	    System.out.print("Enter the ID of the card you want to buy: ");
	    String input = scanner.nextLine();

	    int chosenId;

	    try {
	        chosenId = Integer.parseInt(input);
	    } catch (NumberFormatException e) {
	        System.out.println("Invalid input. Please enter a numeric card ID.");
	        return;
	    }

	    Card selectedCard = marketplace.getCardById(chosenId);

	    if (selectedCard == null) {
	        System.out.println("That card is not in the marketplace.");
	        return;
	    }

	    boolean purchaseSuccessful = currentPlayer.spendCredits(selectedCard.getPrice());

	    if (!purchaseSuccessful) {
	        System.out.println("You do not have enough credits to buy that card.");
	        return;
	    }

	    currentPlayer.addCard(selectedCard);
	    marketplace.removeCardById(chosenId);

	    System.out.println("You bought: " + selectedCard.getName());
	    System.out.println("Remaining credits: " + currentPlayer.getCredits());
	}
	
	private void runMainMenu() {
		boolean running = true;
		
		while (running) {
			System.out.println();
			System.out.println("=== Main Menu===");
			System.out.println("1. View credits");
			System.out.println("2. View owned cards");
			System.out.println("3. View marketplace");
			System.out.println("4. Buy a card");
			System.out.println("5. Sell a card");
			System.out.println("6. Exit");
			System.out.print("Choose an option: ");
			
			String choice = scanner.nextLine();
			
			switch (choice) {
			case "1":
				System.out.println("Your current credits: " + currentPlayer.getCredits());
				break;
			case "2":
				currentPlayer.displayOwnedCards();
				break;
			case "3":
				marketplace.displayAvailableCards();
				break;
			case "4":
				buyCard();
				break;
			case "5":
				System.out.println("Sell feature will be added soon");
				break;
			case "6":
				System.out.println("Exiting Project Moodle.");
				running = false;
				break;
			default:
				System.out.println("Invalid option. Please choose a number from the list");
			
			}
		}
	}
}
