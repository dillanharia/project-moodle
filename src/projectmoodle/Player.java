package projectmoodle;

import java.util.ArrayList;
import java.util.Collections;


public class Player {
	private String username;
	private int credits;
	private ArrayList<Card> ownedCards;
	
	public Player(String username, int startingCredits) {
		this.username = username;
		this.credits = startingCredits;
		this.ownedCards = new ArrayList<>();
	}
	
	
	public String getUsername() {
	return username;
	}
	
	public int getCredits() {
	return credits;
	}
	
	public ArrayList<Card> getOwnedCards() {
		return ownedCards;
	}
	
	public void addCard(Card card) {
		ownedCards.add(card);
	}
	
	public boolean removeCardById(int cardId) {
		for (int i = 0; i < ownedCards.size(); i++) {
			if (ownedCards.get(i).getId() == cardId) {
				ownedCards.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public Card getCardById(int cardId) {
		for (Card card : ownedCards) {
			if (card.getId() == cardId) {
				return card;
			}
		}
		return null;
	}
	
	public void sortOwnedCards() {
		Collections.sort(ownedCards);
	}
	
	public void addCredits(int amount) {
	credits += amount;
	}
	
	public boolean spendCredits(int amount) {
		if (amount > credits) {
			return false;
		}
		credits -= amount;
		return true;
	}
	
	public void displayOwnedCards() {
		sortOwnedCards();
		
		if (ownedCards.isEmpty()) {
			System.out.println("You do not own any cards yet.");
			return;
		}
		
		System.out.println("Your cards:");
		for (Card card : ownedCards) {
			System.out.println(card);
		}
	}
	
}
