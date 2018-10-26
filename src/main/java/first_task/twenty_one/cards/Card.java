package first_task.twenty_one.cards;

public class Card {
    private Rank rank;
    private Suit suit;
    private int value;

    Card (Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;

        setValueFromRank(rank);
    }

    private void setValue (int value) {
        this.value = value;
    }

    private String getRank () {
        return rank.getRank();
    }

    private String getSuit() {
        return suit.getSuit();
    }

    public int getValue() {
        return value;
    }

    private void setValueFromRank (Rank rank) {
        switch (rank.getRank()) {
            case "Ace":
                setValue(11);
                break;
            case "King":
                setValue(4);
                break;
            case "Queen":
                setValue(3);
                break;
            case "Jack":
                setValue(2);
                break;
            case "Ten":
                setValue(10);
                break;
            case "Nine":
                setValue(9);
                break;
            case "Eight":
                setValue(8);
                break;
            case "Seven":
                setValue(7);
                break;
            case "Six":
                setValue(6);
                break;
        }
    }

    @Override
    public String toString() {
        return "The " + getRank() + " of " + getSuit();
    }
}
