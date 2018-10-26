package first_task.letter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class ConsoleTest {

    private InputStream is;

    @Before
    public void setUp() throws Exception {
        StringBuilder sb = new StringBuilder();

        sb.append("a").append('\n');
        sb.append("");

        is = new ByteArrayInputStream(sb.toString().getBytes());

        System.setIn(is);
    }

    @After
    public void tearDown() throws Exception {
        is.close();
        Console.getReader().close();
    }

    @Test
    public void readFromConsole() {
        assertEquals("a", Console.readFromConsole());
        assertEquals("stop", Console.readFromConsole());
    }
}