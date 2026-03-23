package projectmoodle;

import java.util.Scanner;

public class Game {
	
	private Scanner scanner;
	private LoginService loginService;
	
	public Game() {
		scanner = new Scanner(System.in);
		loginService = new LoginService();;
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
        
        System.out.println();
        System.out.println("Login successful");
        System.out.println("Welcome, " + username + "!");
        
	}
}
