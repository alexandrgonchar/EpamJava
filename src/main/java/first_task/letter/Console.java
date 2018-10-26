package first_task.letter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

class Console {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static String readFromConsole () {
        String result = "";

        try {
            String inputControl;

            if ((inputControl = reader.readLine()) == null) result = "stop";

            else {

                result = inputControl.toLowerCase(Locale.ENGLISH);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return result;
    }

    static void print(String message) {
        System.out.println(message);
    }

    static void winMessage (char winChar, int count) {
        System.out.printf("You win!!!The correct letter is: %c. Number of attempts: %d", winChar, count);
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static BufferedReader getReader () {
        return reader;
    }
}
