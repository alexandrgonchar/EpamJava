package first_task.twenty_one.players;

import first_task.twenty_one.cards.Deck;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerTest {
    private Deck deck;
    private Hand hand;
    private Computer computer;

    @Before
    public void setUp() {
        deck = new Deck();
        hand = new Hand(deck);
        computer = new Computer(hand);
    }

    @After
    public void tearDown() {
        computer = null;
        hand = null;
        deck = null;
    }

    @Test
    public void isTwentyOneOnTwenty() {
        hand.setScore(20);
        computer.isTwentyOne();
        assertEquals(20, hand.getScore());
        assertFalse(computer.isPlay());
    }

    @Test
    public void isTwentyOneOnMax () {
        hand.setScore(Integer.MAX_VALUE);
        computer.isTwentyOne();
        assertFalse(computer.isPlay());
    }

    @Test
    public void isTwentyOneOnZero () {
        hand.setScore(0);
        computer.isTwentyOne();
        assertTrue(hand.getScore() != 0);
        assertTrue(computer.isPlay());
    }
}