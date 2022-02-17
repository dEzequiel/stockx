package edu.poniperro.stockx.criteria;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;

import edu.poniperro.stockx.item.Bid;
import edu.poniperro.stockx.item.Offer;
import edu.poniperro.stockx.item.Sale;
import edu.poniperro.stockx.item.Sneaker;

public class SizeTest {
    

    @Test
    public void getSneakersFilterBySize() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        sneaker.add(new Sale("9.5", 352));
        sneaker.add(new Sale("9.5", 404));
        sneaker.add(new Sale("10", 404));


        Criteria size = new Size("9.5");
        List<Offer> bySize = size.checkCriteria(sneaker);

        assertEquals("9.5", bySize.get(0).size());
        assertEquals("9.5", bySize.get(1).size());
    }
}
