package first_task.twenty_one.cards;

public enum Rank {
    ACE ("Ace", 11),
    KING ("King", 4),
    QUEEN ("Queen", 3),
    JACK ("Jack", 2),
    TEN ("Ten", 10),
    NINE ("Nine", 9),
    EIGHT ("Eight", 8),
    SEVEN ("Seven", 7),
    SIX ("Six", 6);

    private String rank;
    private int value;

    Rank (String rank, int value) {

        this.rank = rank;
        this.value = value;
    }

    public String getRank () {
        return rank;
    }

    public int getValue () {
        return value;
    }
}
