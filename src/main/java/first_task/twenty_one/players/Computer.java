package first_task.twenty_one.players;

public class Computer extends Player {
    private Hand hand;
    private boolean isPlay = true;

    public Computer (Hand hand) {
        super(hand);
        this.hand = hand;
    }

    @Override
    public void isTwentyOne () {
        if (isPlay) {
            if (hand.getScore() >= 20) {
                isPlay = false;
            } else if (hand.getScore() < 20) {
                hand.drawOne();
            }
        }
    }

    @Override
    public boolean isPlay() {
        return isPlay;
    }

    @Override
    public String toString() {
        return "Computer";
    }
}
