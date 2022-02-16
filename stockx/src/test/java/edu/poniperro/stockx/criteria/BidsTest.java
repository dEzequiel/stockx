package edu.poniperro.stockx.criteria;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import edu.poniperro.stockx.item.Bid;
import edu.poniperro.stockx.item.Sneaker;

public class BidsTest {
    
    @Test
    public void checkCriteriaBidListSize() {

        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        Bid bid = new Bid("6", 200);
        Bid bid1 = new Bid("6", 200);
        Bid bid2 = new Bid("6", 200);

        Criteria bids = new Bids();

        sneaker.add(bid);
        sneaker.add(bid1);
        sneaker.add(bid2);

        assertEquals(3, bids.checkCriteria(sneaker).size());        
    }
}
