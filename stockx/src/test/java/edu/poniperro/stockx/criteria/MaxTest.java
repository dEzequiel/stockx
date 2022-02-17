package edu.poniperro.stockx.criteria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.Test;

import edu.poniperro.stockx.item.Bid;
import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Sneaker;
import edu.poniperro.stockx.criteria.Max;


public class MaxTest {
    
    @Test
    public void checkMaxValue() {

        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        Criteria size = new Size("9.5");
        Criteria bids = new Bids();

        sneaker.add(new Bid("13", 338));
        sneaker.add(new Bid("9.5", 479));
        sneaker.add(new Bid("9.5", 480));

        Criteria maxSizeBids = new Max(size, bids);

        assertEquals(1, maxSizeBids.checkCriteria(sneaker).size());
        assertEquals(480, maxSizeBids.checkCriteria(sneaker).get(0).value());
        assertEquals("9.5", maxSizeBids.checkCriteria(sneaker).get(0).size());

    }

    @Test
    public void checkMaxIsEmpty() {

        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        Criteria size = new Size("9.5");
        Criteria bids = new Bids();

        Criteria maxSizeBids = new Max(size, bids);

        assertEquals(0, maxSizeBids.checkCriteria(sneaker).size());
        assertNotNull(maxSizeBids.checkCriteria(sneaker));
        assertTrue("Is empty", maxSizeBids.checkCriteria(sneaker).isEmpty());

    }
}
