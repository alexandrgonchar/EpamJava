package first_task.twenty_one;

import first_task.twenty_one.cards.Deck;
import first_task.twenty_one.players.Computer;
import first_task.twenty_one.players.Hand;
import first_task.twenty_one.players.Human;
import first_task.twenty_one.players.Player;


public class TwentyOne {
    public static void main(String[] args) {
        Deck deck = new Deck();

        Human human = new Human(new Hand(deck));
        Computer computer = new Computer(new Hand(deck));

        findWinner(startGame(human, computer));
    }

    private static Player[] startGame (Player player1, Player player2) {
        Console.showHand(player1, player1.getHand());
        Console.printMessage("Do you want draw a card? 'Y' or 'N'");

        while (player1.isPlay() | player2.isPlay()) {
            player2.isTwentyOne();
            player1.isTwentyOne();
        }

        return new Player[]{player1, player2};
    }

    private static void findWinner(Player players[]) {
        Console.showHand(players[0], players[0].getHand());
        Console.showHand(players[1],players[1].getHand());

        int player1 = players[0].getHand().getScore();
        int player2 = players[1].getHand().getScore();

        defineWinner(players[0], players[1], compareHands(player1, player2));
    }

    public static int compareHands(int player1Score, int player2Score) {

        if (player1Score == player2Score) {
            return 0;

        } else if (player1Score == 21) {
            return 1;

        } else if (player2Score == 21) {
            return 2;

        } else if (player1Score > 21 && player2Score < 21) {
            return 2;

        } else if (player1Score < 21 && player2Score > 21) {
            return 1;

        } else if (player1Score < 21 | player2Score < 21) {

            if (player1Score > player2Score) {
                return 1;

            } else {
                return 2;
            }

        } else if (player1Score < player2Score) {
            return 1;

        } else {
            return 2;
        }
    }

    private static void defineWinner (Player player1, Player player2, int status) {
        switch (status) {
            case 0:
                Console.printMessage("Nobody wins! Restart game and play one more time.");
                break;
            case 1:
                Console.getCongratulations(player1);
                break;
            case 2:
                Console.getCongratulations(player2);
                break;
        }
    }
}
