package edu.poniperro.stockx.criteria;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.poniperro.stockx.item.Bid;
import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Sneaker;

public class MinTest {

    @Test
    public void checkMinValue() {

        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        Criteria size = new Size("9.5");
        Criteria bids = new Bids();

        sneaker.add(new Bid("9.5", 479));
        sneaker.add(new Bid("9.5", 480));
        sneaker.add(new Bid("9.5", 400));


        Criteria minSizeBids = new Min(size, bids);

        assertEquals(1, minSizeBids.checkCriteria(sneaker).size());
        assertEquals(400, minSizeBids.checkCriteria(sneaker).get(0).value());
        assertEquals("9.5", minSizeBids.checkCriteria(sneaker).get(0).size());

    }

    @Test
    public void checkMaxIsEmpty() {

        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        Criteria size = new Size("9.5");
        Criteria bids = new Bids();

        Criteria minSizeBids = new Min(size, bids);

        assertEquals(0, minSizeBids.checkCriteria(sneaker).size());
        assertNotNull(minSizeBids.checkCriteria(sneaker));
        assertTrue("Is empty", minSizeBids.checkCriteria(sneaker).isEmpty());

    }
}
