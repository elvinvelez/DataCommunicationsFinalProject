import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PokerApp {

	public static void main(String[] args) {

		ArrayList<Card> deck = createDeck();
		Scanner kb = new Scanner(System.in);

		


	}

	private static void bettingTime(boolean bettingTurn, double currentBet, Player player1, Player player2) {
		if(bettingTurn) {
			Scanner kb = new Scanner(System.in);
			System.out.println("Player 1 turn...");
			System.out.println("Will you match player 1 bet of " + currentBet + "?");
			System.out.println("1. Call \n"
							  +"2. Fold \n"
							  +"3. Raise");
			
		
		}
		
		
		
	}
	private static double initialBet(Boolean turn, Player player1, Player player2) {
		if(turn) {
			System.out.println("Player one made the initial bet...");
			player1.setMoney(player1.getMoney() - 100);
			
			displayCards(player1, "Player 1");
			displayCards(player2, "Player 2");
			
			turn = false;
			return 100;
		}
		else {
			System.out.println("Player two made the initial bet...");
			player2.setMoney(player2.getMoney() - 100);
			
			
			displayCards(player2, "Player 2");
			displayCards(player1, "Player 1");
			
			turn = true;
			return 100;
		}
		
	}
	public static void cleanConsole() {
		for(int i = 0; i < 80; i++)
			System.out.println();
	}
	public static ArrayList<Card> createDeck() {
		ArrayList<Card> deck = new ArrayList<Card>();

		deck.add(new Card(Suit.CLUBS, Value.TWO));
		deck.add(new Card(Suit.DIAMONDS, Value.TWO));
		deck.add(new Card(Suit.HEARTS, Value.TWO));
		deck.add(new Card(Suit.CLUBS, Value.TWO));

		deck.add(new Card(Suit.CLUBS, Value.THREE));
		deck.add(new Card(Suit.DIAMONDS, Value.THREE));
		deck.add(new Card(Suit.HEARTS, Value.THREE));
		deck.add(new Card(Suit.CLUBS, Value.THREE));

		deck.add(new Card(Suit.CLUBS, Value.FOUR));
		deck.add(new Card(Suit.DIAMONDS, Value.FOUR));
		deck.add(new Card(Suit.HEARTS, Value.FOUR));
		deck.add(new Card(Suit.CLUBS, Value.FOUR));

		deck.add(new Card(Suit.CLUBS, Value.FIVE));
		deck.add(new Card(Suit.DIAMONDS, Value.FIVE));
		deck.add(new Card(Suit.HEARTS, Value.FIVE));
		deck.add(new Card(Suit.CLUBS, Value.FIVE));

		deck.add(new Card(Suit.CLUBS, Value.SIX));
		deck.add(new Card(Suit.DIAMONDS, Value.SIX));
		deck.add(new Card(Suit.HEARTS, Value.SIX));
		deck.add(new Card(Suit.CLUBS, Value.SIX));

		deck.add(new Card(Suit.CLUBS, Value.SEVEN));
		deck.add(new Card(Suit.DIAMONDS, Value.SEVEN));
		deck.add(new Card(Suit.HEARTS, Value.SEVEN));
		deck.add(new Card(Suit.CLUBS, Value.SEVEN));

		deck.add(new Card(Suit.CLUBS, Value.EIGHT));
		deck.add(new Card(Suit.DIAMONDS, Value.EIGHT));
		deck.add(new Card(Suit.HEARTS, Value.EIGHT));
		deck.add(new Card(Suit.CLUBS, Value.EIGHT));

		deck.add(new Card(Suit.CLUBS, Value.NINE));
		deck.add(new Card(Suit.DIAMONDS, Value.NINE));
		deck.add(new Card(Suit.HEARTS, Value.NINE));
		deck.add(new Card(Suit.CLUBS, Value.NINE));

		deck.add(new Card(Suit.CLUBS, Value.TEN));
		deck.add(new Card(Suit.DIAMONDS, Value.TEN));
		deck.add(new Card(Suit.HEARTS, Value.TEN));
		deck.add(new Card(Suit.CLUBS, Value.TEN));

		deck.add(new Card(Suit.CLUBS, Value.J));
		deck.add(new Card(Suit.DIAMONDS, Value.J));
		deck.add(new Card(Suit.HEARTS, Value.J));
		deck.add(new Card(Suit.CLUBS, Value.J));

		deck.add(new Card(Suit.CLUBS, Value.Q));
		deck.add(new Card(Suit.DIAMONDS, Value.Q));
		deck.add(new Card(Suit.HEARTS, Value.Q));
		deck.add(new Card(Suit.CLUBS, Value.Q));

		deck.add(new Card(Suit.CLUBS, Value.K));
		deck.add(new Card(Suit.DIAMONDS, Value.K));
		deck.add(new Card(Suit.HEARTS, Value.K));
		deck.add(new Card(Suit.CLUBS, Value.K));

		deck.add(new Card(Suit.CLUBS, Value.A));
		deck.add(new Card(Suit.DIAMONDS, Value.A));
		deck.add(new Card(Suit.HEARTS, Value.A));
		deck.add(new Card(Suit.CLUBS, Value.A));

		return deck;

	}
	public static void displayCards(Player player, String name) {
		System.out.print(name+ ":\t\t");
		System.out.print(player.getCard1().toString() + "\t\t");
		System.out.print(player.getCard2().toString()+ "\t\t");
		System.out.println(player.getMoney());
	}


}
