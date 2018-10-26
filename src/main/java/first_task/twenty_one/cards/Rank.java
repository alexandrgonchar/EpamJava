package first_task.twenty_one.cards;

public enum Rank {
    ACE ("Ace"),
    KING ("King"),
    QUEEN ("Queen"),
    JACK ("Jack"),
    TEN ("Ten"),
    NINE ("Nine"),
    EIGHT ("Eight"),
    SEVEN ("Seven"),
    SIX ("Six");

    private String rank;

    Rank (String rank) {
        this.rank = rank;
    }

    public String getRank () {
        return rank;
    }
}
