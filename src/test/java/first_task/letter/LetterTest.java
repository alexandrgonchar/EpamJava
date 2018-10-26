package first_task.letter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LetterTest {

    private int i;
    private int max;
    private int min;

    @Before
    public void setUp() throws Exception {
        i = 0;
        max = 0;
        min = Integer.MAX_VALUE;
    }

    @Test
    public void testGetRandomChar () {


        while (i <= 1000000) {
            int j = Letter.getRandomChar();

            if (j > max) max = j;
            if (j < min) min = j;
            i++;
        }

        assertTrue(max <= 'z');
        assertTrue(min >= 'a');
    }

    @Test
    public void testInputCheck () {
        assertEquals(-1, Letter.inputCheck("stop"));
        assertEquals(3, Letter.inputCheck("}"));
    }

    @After
    public void tearDown() throws Exception {
        i = 0;
        max = 0;
        min = 0;
    }
}