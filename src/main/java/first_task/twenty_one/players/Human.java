package first_task.twenty_one.players;

import first_task.twenty_one.Console;

import java.util.Locale;

public class Human extends Player{
    private Hand hand;
    private boolean isPlay = true;

    public Human(Hand hand) {
        super(hand);
        this.hand = hand;
    }

    @Override
    public void isTwentyOne () {
        if (isPlay) {
            switch (Console.readFromConsole().toUpperCase(Locale.ENGLISH)) {
                case "Y":
                    hand.drawOne();
                    Console.showHand(this, hand);
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
    public boolean isPlay() {
        return isPlay;
    }

    @Override
    public String toString() {
        return "Human";
    }
}
