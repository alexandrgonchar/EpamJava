package first_task.twenty_one.cards;

import java.util.Locale;

public class Card {
    private Rank rank;
    private Suit suit;
    private int value;

    Card (Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        this.value = rank.getValue();
    }

    private String getRank () {
        return rank.getRank();
    }

    private String getSuit() {
        return suit.toString().toLowerCase(Locale.ENGLISH);
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "The " + getRank() + " of " + getSuit();
    }
}
