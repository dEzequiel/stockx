package edu.poniperro.stockx.criteria;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import edu.poniperro.stockx.item.Bid;
import edu.poniperro.stockx.item.Offer;
import edu.poniperro.stockx.item.Sneaker;

public class MaxBidTest {
    
    @Test
    public void getMaxBid() {

        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        
        Bid bid = new Bid("6", 200);
        Bid bid1 = new Bid("6", 300);
        Bid bid2 = new Bid("6", 400);

        sneaker.add(bid);
        sneaker.add(bid1);
        sneaker.add(bid2);

        Criteria maxBid = new MaxBid();
        List<Offer> maximum = maxBid.checkCriteria(sneaker);

        sneaker.setBid(maximum.isEmpty()? 0 : maximum.get(0).value());
        assertEquals(bid2, maximum.get(0));
        assertEquals(1, maximum.size());
        
    }
}
