package edu.poniperro.stockx.criteria;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import edu.poniperro.stockx.item.Ask;
import edu.poniperro.stockx.item.Offer;
import edu.poniperro.stockx.item.Sneaker;

public class MinAskTest {
    
    @Test
    public void getMinAsk() {

        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        Ask ask = new Ask("6", 200);
        Ask ask1 = new Ask("6", 100);
        Ask ask2 = new Ask("6", 98);

        sneaker.add(ask);
        sneaker.add(ask1);
        sneaker.add(ask2);

        Criteria minAsk = new MinAsk();
        List<Offer> minimum = minAsk.checkCriteria(sneaker);
        sneaker.setAsk(minimum.isEmpty()? 0 : minimum.get(0).value());

        assertEquals(98, sneaker.getAsk());
        assertEquals(1, minimum.size());
    }
}
