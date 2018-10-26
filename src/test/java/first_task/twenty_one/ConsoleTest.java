package first_task.twenty_one;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class ConsoleTest {

    private InputStream is;

    @Before
    public void setUpConsoleDate () {
        StringBuilder sb = new StringBuilder();

        sb.append("a").append('\n');
        sb.append("");

        is = new ByteArrayInputStream(sb.toString().getBytes());

        System.setIn(is);
    }

    @Test
    public void readFromConsole() {
        assertEquals("a", Console.readFromConsole());
        assertEquals("N" , Console.readFromConsole());
    }

    @After
    public void tearDown () throws Exception{
        is.close();
        Console.stopDraw();
    }
}