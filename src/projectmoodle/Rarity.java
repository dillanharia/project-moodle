package projectmoodle;

public enum Rarity {
	COMMON(1),
	UNCOMMON(2),
	RARE(3),
	UNIQUE(4);
	
	private final int rankValue;
	
	Rarity(int rankValue) {
		this.rankValue = rankValue;
	}
	
	public int getRankValue() {
		return rankValue;
	}
	
	
	
}
