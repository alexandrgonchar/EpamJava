package first_task.twenty_one.players;

public abstract class Player {
    private Hand hand;
    private boolean isPlay = true;

    Player(Hand hand) {
        this.hand = hand;
    }

    public abstract void isTwentyOne ();

    public boolean isPlay() {
        return isPlay;
    }

    public Hand getHand() {
        return hand;
    }

}
