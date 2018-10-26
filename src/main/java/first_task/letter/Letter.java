package first_task.letter;

import java.util.concurrent.ThreadLocalRandom;

public class Letter {

    private static int from = 'a';
    private static int to = 'z';

    public static void main(String[] args) {
        game();
    }

    private static void game() {
        char winLetter =  getRandomChar();
        String playerInput = "";
        boolean areYouWin;
        int count = 0;

        Console.print("Print your letter(one letter in line!): ");

        do {
            playerInput = Console.readFromConsole();
            areYouWin = isCorrect(getValueOfDecision(winLetter, playerInput));
            count++;

        } while (!areYouWin);

        if (playerInput.equalsIgnoreCase("stop")) Console.print("You lost!");
        else
            Console.winMessage(winLetter, count);
    }

    public static char getRandomChar()
    {
        return (char) ThreadLocalRandom.current().nextInt(from, to + 1);
    }

    private static boolean isCorrect (int decision) {
        switch (decision) {
            case -1:
                Console.print("Game has been stopped by user");
                return true;
            case 2:
                Console.print("Too mush symbols!");
                return false;
            case 3:
                Console.print("Not a letter! Try again: ");
                return false;
            case 4:
                Console.print("Too low!");
                return false;
            case 5:
                Console.print("Too high!");
                return false;
            case 6:
                return true;
            default:
                return false;
        }
    }

    private static int getValueOfDecision(char winChar, String playerInput) {

        int inputCheck = inputCheck(playerInput);

        if (inputCheck != 1)
            return inputCheck;

        else {
            char playerChar = playerInput.charAt(0);

            if (winChar < playerChar)
                return 4;

            else if (winChar > playerChar)
                return 5;
        }

            return 6;
    }

    // Проверка на недопустимый диапазон символов
    public static int inputCheck (String playerInput) {

        if (playerInput.equalsIgnoreCase("stop")) return -1;

        else if (playerInput.length() == 0) return 0;

        else if (playerInput.length() > 1) return 2;

        else {
            char playerChar = playerInput.charAt(0);

            if (playerChar < from || playerChar > to) return 3;

            else return 1;
        }
    }
}
