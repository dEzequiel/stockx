package edu.poniperro.stockx.criteria;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import edu.poniperro.stockx.item.Ask;
import edu.poniperro.stockx.item.Bid;
import edu.poniperro.stockx.item.Sneaker;

public class AskTest {
    
    @Test
    public void checkCriteriaAskListSize() {

        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        Ask ask = new Ask("6", 200);
        Ask ask1 = new Ask("6", 200);
        Ask ask2 = new Ask("6", 200);
        Bid bid = new Bid("6", 200);
        Bid bid1 = new Bid("6", 200);
        Bid bid2 = new Bid("6", 200);

        Criteria asks = new Asks();

        sneaker.add(ask);
        sneaker.add(ask1);
        sneaker.add(ask2);
        sneaker.add(bid);
        sneaker.add(bid1);
        sneaker.add(bid2);

        assertEquals(3, asks.checkCriteria(sneaker).size());        
    }
}