package first_task.twenty_one.cards;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {
    private Deck deck;
    private Card card;

    @Before
    public void setUp()  {
        deck = new Deck();
    }

    @After
    public void tearDown() {
        deck = null;
        card = null;
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testDeck() {
        for (int i = 0; i < 36; i++) {
            card = deck.draw();
            assertNotNull(card);
            assertTrue(card.getValue() != 0);
        }

        deck.draw();
    }

}