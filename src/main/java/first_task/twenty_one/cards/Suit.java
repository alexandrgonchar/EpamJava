package first_task.twenty_one.cards;

public enum Suit {
    SPADES ("Spades"),
    CLUBS ("Clubs"),
    HEARTS ("Hearts"),
    DIAMONDS ("Diamonds");

    private String suit;

    Suit (String suit) {
        this.suit = suit;
    }

    public String getSuit () {
        return suit;
    }
}
