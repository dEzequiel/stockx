package edu.poniperro.stockx.criteria;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import edu.poniperro.stockx.item.Ask;
import edu.poniperro.stockx.item.Bid;
import edu.poniperro.stockx.item.Offer;
import edu.poniperro.stockx.item.Sale;
import edu.poniperro.stockx.item.Sneaker;

public class SalesTest {
    
    @Test
    public void checkCriteriaSalesListSize() {

        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        Ask ask = new Ask("6", 200);
        Ask ask1 = new Ask("6", 200);
        Ask ask2 = new Ask("6", 200);
        Bid bid = new Bid("6", 200);
        Bid bid1 = new Bid("6", 200);
        Bid bid2 = new Bid("6", 200);
        Sale sale = new Sale("6", 356);
        sneaker.add(sale);
        sneaker.add(new Sale("9.5", 352));
        sneaker.add(new Sale("9.5", 404));
        sneaker.add(new Sale("13", 360));
        sneaker.add(new Sale("13", 372));

        Criteria sales = new Sales();

        sneaker.add(ask);
        sneaker.add(ask1);
        sneaker.add(ask2);
        sneaker.add(bid);
        sneaker.add(bid1);
        sneaker.add(bid2);

        assertEquals(5, sales.checkCriteria(sneaker).size());        
    }

    @Test
    public void getLastSale() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        Sale sale = new Sale("6", 356);
        sneaker.add(sale);
        sneaker.add(new Sale("9.5", 352));
        sneaker.add(new Sale("9.5", 404));
        sneaker.add(new Sale("13", 360));
        sneaker.add(new Sale("13", 372));

        Criteria sales = new LastSale();
        List<Offer> lastSale = sales.checkCriteria(sneaker);

        sneaker.setSale(lastSale.get(0).value());

        assertEquals(372, sneaker.getSale());
    }   
}

