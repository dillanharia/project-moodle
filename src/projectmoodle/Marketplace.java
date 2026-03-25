package projectmoodle;

import java.util.ArrayList;
import java.util.Collections;

public class Marketplace {
	
	private ArrayList<Card> availableCards;
	
	public Marketplace(CardLibrary cardLibrary) {
		availableCards = new ArrayList<>();
		
		for (Card card : cardLibrary.getAllCards()) {
			availableCards.add(new Card(
					card.getId(),
					card.getName(),
					card.getRarity(),
					card.getPrice()
			));
		}
	}
	
	public ArrayList<Card> getAvailableCards() {
		return availableCards;
		
	}
	
	public Card getCardById(int cardId) {
		for (Card card : availableCards) {
			if (card.getId() == cardId) {
				return card;
			}
		}
		return null;
	}
	
	public boolean removeCardById(int cardId) {
		for (int i = 0; i < availableCards.size(); i++) {
			if (availableCards.get(i).getId() == cardId) {
				availableCards.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void displayAvailableCards() {
		if (availableCards.isEmpty()) {
			System.out.println("The marketplace is currently empty.");
			return;
		}
		
		Collections.sort(availableCards);
		
		System.out.println("Marketplace cards:");
		for (Card card: availableCards) {
			System.out.println(card);
		}
	}
	
}
