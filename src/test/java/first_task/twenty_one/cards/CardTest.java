package first_task.twenty_one.cards;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {
    private Card aceCard;
    private Card kingCard;
    private Card queenCard;
    private Card jackCard;
    private Card tenCard;
    private Card nineCard;
    private Card eightCard;
    private Card sevenCard;
    private Card sixCard;


    @Before
    public void setUp() {
        aceCard = new Card(Rank.ACE, Suit.CLUBS);
        kingCard = new Card(Rank.KING, Suit.CLUBS);
        queenCard = new Card(Rank.QUEEN, Suit.CLUBS);
        jackCard = new Card(Rank.JACK, Suit.CLUBS);
        tenCard = new Card(Rank.TEN, Suit.CLUBS);
        nineCard = new Card(Rank.NINE, Suit.CLUBS);
        eightCard = new Card(Rank.EIGHT, Suit.CLUBS);
        sevenCard = new Card(Rank.SEVEN, Suit.CLUBS);
        sixCard = new Card(Rank.SIX, Suit.CLUBS);
    }

    @After
    public void tearDown() {
        aceCard = null;
        kingCard = null;
        queenCard = null;
        jackCard = null;
        tenCard = null;
        nineCard  = null;
        eightCard = null;
        sevenCard = null;
        sixCard = null;
    }

    @Test
    public void setValueFromRank() {
        assertEquals(11, aceCard.getValue());
        assertEquals(4, kingCard.getValue());
        assertEquals(3, queenCard.getValue());
        assertEquals(2, jackCard.getValue());
        assertEquals(10, tenCard.getValue());
        assertEquals(9, nineCard.getValue());
        assertEquals(8, eightCard.getValue());
        assertEquals(7, sevenCard.getValue());
        assertEquals(6, sixCard.getValue());
    }
}