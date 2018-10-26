package first_task.twenty_one.players;

import first_task.twenty_one.cards.Card;
import first_task.twenty_one.cards.Deck;

import java.util.ArrayList;

public class Hand {
    private Deck deck;
    private ArrayList<Card> hand;
    private int score;

    public Hand (Deck deck) {
        this.deck = deck;
        hand = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            drawOne();
        }
    }

    void drawOne () {
        Card drew = deck.draw();
        hand.add(drew);
        score += drew.getValue();
    }

    public void setScore (int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getHand() {
        StringBuilder result = new StringBuilder();

        for (Card card : hand) {
            result.append(" " + card.toString() + ";");
        }
        return result.toString();
    }
}
