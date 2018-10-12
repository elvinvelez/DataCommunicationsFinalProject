
public class Player {

	private Card card1;
	private Card card2;
	private Double money;
	
	public Player(Card card1, Card card2, Double money) {
		this.card1 = card1;
		this.card2 = card2;
		this.money = money;
	}

	public Card getCard1() {
		return card1;
	}

	public Card getCard2() {
		return card2;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}
	
	
}
