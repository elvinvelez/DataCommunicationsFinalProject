public class Card {

	Suit suit;
	Value value;
	String photoUrl;

	public Card(Suit suit, Value value, String photoUrl) {
		this.suit = suit; 
		this.value = value;
		this.photoUrl = photoUrl;
	}
	public Card(Suit suit, Value value) {
		this.suit = suit;
		this.value = value;
	}
	
	public Suit getSuit() {
		return suit;
	}
	public Value getValue() {
		return value;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public String toString() {
		return suit + "-" + value; 
	}

}
