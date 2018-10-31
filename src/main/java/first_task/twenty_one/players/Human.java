package first_task.twenty_one.players;

import first_task.twenty_one.Console;

import java.util.Locale;

public class Human extends Player {
    private boolean isPlay = true;

    public Human(Hand hand) {
        super(hand);
    }

    @Override
    public void isTwentyOne () {
        if (isPlay) {
            switch (Console.readFromConsole().toUpperCase(Locale.ENGLISH)) {
                case "Y":
                    this.getHand().drawOne();
                    Console.showHand(this, this.getHand());
                    break;
                case "N":
                    isPlay = false;
                    Console.stopDraw();
                    break;
                default:
                    Console.printMessage("Chose only between Y or N! Try again: ");
                    break;
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
        return "Human";
    }
}
