import java.util.ArrayList;
import java.util.List;

public class CardGame {
    public static void main(String[] args) {
        DeckOfCard deck = new DeckOfCard();

        List<List<Card>> players = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            players.add(deck.dealCards(9));
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (Card card : players.get(i)) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}