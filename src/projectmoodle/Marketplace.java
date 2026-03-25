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
