package projectmoodle;

public class Card implements Comparable<Card> {
	private int id;
	private String name;
	private Rarity rarity;
	private int price;
	
	public Card(int id, String name, Rarity rarity, int price) {
		this.id = id;
		this.name = name;
		this.rarity = rarity;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Rarity getRarity() {
		return rarity;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public int compareTo(Card otherCard) {
		if (this.rarity.getRankValue() != otherCard.rarity.getRankValue()) {
		return Integer.compare(otherCard.rarity.getRankValue(), this.rarity.getRankValue());
		}
		
		int nameComparison = this.name.compareToIgnoreCase(otherCard.name);
		if (nameComparison != 0) {
				return nameComparison;
		}
			
		return Integer.compare(this.id, otherCard.id);
	}
	
	@Override public String toString() {
		return "[" + id + "] " + name + " | " + rarity + " | " + price + " credits";
	}

}
