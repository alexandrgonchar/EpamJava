package first_task.twenty_one.players;

import first_task.twenty_one.cards.Deck;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class HumanTest {
    private Deck deck;
    private Hand hand;
    private Human human;
    private InputStream is;

    @Before
    public void setUp() throws Exception {
        deck = new Deck();
        hand = new Hand(deck);
        human = new Human(hand);

        StringBuilder sb = new StringBuilder();

        sb.append("a").append('\n');
        sb.append("y").append('\n');
        sb.append("Y").append('\n');
        sb.append("n").append('\n');
        sb.append("N").append('\n');
        sb.append("");

        is = new ByteArrayInputStream(sb.toString().getBytes());

        System.setIn(is);
    }

    @After
    public void tearDown() throws Exception {
        is.close();
    }

    @Test
    public void isTwentyOne() {
        human.isTwentyOne();
        assertTrue(human.isPlay());

        human.isTwentyOne();
        assertTrue(human.isPlay());

        human.isTwentyOne();
        assertTrue(human.isPlay());

        human.isTwentyOne();
        assertFalse(human.isPlay());

        human.isTwentyOne();
        assertFalse(human.isPlay());

        human.isTwentyOne();
        assertFalse(human.isPlay());
    }
}