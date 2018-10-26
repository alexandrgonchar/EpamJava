package first_task.twenty_one.cards;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;

    public Deck () {
        deck = new ArrayList<>();
        deck = getShuffledDeck();
    }

    private ArrayList<Card> getShuffledDeck() {
        deckFill();
        Collections.shuffle(deck);

        return deck;
    }

    private void deckFill () {

        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public Card draw () {
        Card drewCard = deck.get(0);
        deck.remove(0);

        return drewCard;
    }
}
