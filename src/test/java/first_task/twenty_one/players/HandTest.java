package first_task.twenty_one.players;

import first_task.twenty_one.cards.Deck;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HandTest {
    private Deck deck;
    private Hand hand;

    @Before
    public void setUp() {
        deck = new Deck();
        hand = new Hand(deck);
    }

    @After
    public void tearDown() {
        hand = null;
        deck = null;
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testHand() {
        int score = hand.getScore();

        for (int i = 0; i < 34; i++) {
            hand.drawOne();
            assertTrue(score < hand.getScore());
            score = hand.getScore();
        }

        hand.drawOne();
    }
}