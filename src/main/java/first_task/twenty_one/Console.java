package first_task.twenty_one;

import first_task.twenty_one.players.Hand;
import first_task.twenty_one.players.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Console {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void printMessage (String message) {
        System.out.println(message);
    }

    public static String readFromConsole() {
        String result = "";

        try {
            String inputControl;
            if ((inputControl = reader.readLine()) == null) result = "N";

            else result = inputControl;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void stopDraw () {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("You chose stop drawing.");
    }

    public static void showHand (Player player, Hand hand) {
        System.out.println(player.toString() + " hand is: "
                + hand.getHand() + ". Score: " + hand.getScore());
    }

    static void getCongratulations (Player player) {
        System.out.println(player.toString() + " wins!");
    }
}
