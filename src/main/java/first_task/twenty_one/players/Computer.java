package first_task.twenty_one.players;

public class Computer extends Player {
    private boolean isPlay = true;

    public Computer (Hand hand) {
        super(hand);
    }

    @Override
    public void isTwentyOne () {
        if (isPlay) {
            if (this.getHand().getScore() >= 20) {
                isPlay = false;
            } else if (this.getHand().getScore() < 20) {
                this.getHand().drawOne();
            }
        }
    }

    @Override
    public Hand getHand() {
        return super.getHand();
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
