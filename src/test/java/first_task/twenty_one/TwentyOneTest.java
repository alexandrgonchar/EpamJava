package first_task.twenty_one;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwentyOneTest {

    @Test
    public void compareHands() {
        assertEquals(0, TwentyOne.compareHands(21, 21));
        assertEquals(1, TwentyOne.compareHands(26, 27));
        assertEquals(2, TwentyOne.compareHands(28, 19));
    }
}