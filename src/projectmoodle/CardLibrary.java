package projectmoodle;

import java.util.ArrayList;

public class CardLibrary {

	private ArrayList<Card> allCards;
	
	public CardLibrary() {
		allCards = new ArrayList<>();
	}
	
	public ArrayList<Card> getAllCards() {
		return allCards;
	}
	
}
