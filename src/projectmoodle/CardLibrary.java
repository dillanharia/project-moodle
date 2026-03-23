package projectmoodle;

import java.util.ArrayList;

public class CardLibrary {

	private ArrayList<Card> allCards;
	
	public CardLibrary() {
		allCards = new ArrayList<>();
		initialiseCards();
	}
	
	private void initialiseCards() {
		
		// COMMON
		allCards.add(new Card(101, "Compsognathus", Rarity.COMMON, 10));
		allCards.add(new Card(102, "Hypsilophodon", Rarity.COMMON, 12));
		allCards.add(new Card(103, "Gallimimus", Rarity.COMMON, 15));
		
		// UNCOMMON
		allCards.add(new Card(201, "Parasaurolophus", Rarity.COMMON, 25));
		allCards.add(new Card(202, "Ankylosaurus", Rarity.UNCOMMON, 30));
	    allCards.add(new Card(203, "Iguanodon", Rarity.UNCOMMON, 28));

	    // RARE
	    allCards.add(new Card(301, "Stegosaurus", Rarity.RARE, 45));
	    allCards.add(new Card(302, "Allosaurus", Rarity.RARE, 50));
	    allCards.add(new Card(303, "Carnotaurus", Rarity.RARE, 55));

	     // UNIQUE
	    allCards.add(new Card(401, "Tyrannosaurus Rex", Rarity.UNIQUE, 100));
	    allCards.add(new Card(402, "Spinosaurus", Rarity.UNIQUE, 110));
	    allCards.add(new Card(403, "Giganotosaurus", Rarity.UNIQUE, 120));
	}
	
	
	
	public ArrayList<Card> getAllCards() {
		return allCards;
	}
	
}
