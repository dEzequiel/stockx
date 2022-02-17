package edu.poniperro.stockx.criteria;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;

import edu.poniperro.stockx.item.Ask;
import edu.poniperro.stockx.item.Bid;
import edu.poniperro.stockx.item.Offer;
import edu.poniperro.stockx.item.Sale;
import edu.poniperro.stockx.item.Sneaker;
import edu.poniperro.stockx.criteria.AndCriteria;


public class AndCriteriaTest {
    
    @Test
    public void getSneakersBySaleAndSize() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        sneaker.add(new Sale("9.5", 352));
        sneaker.add(new Sale("9.5", 404));
        sneaker.add(new Sale("10", 404));
        sneaker.add(new Bid("9.5", 352));
        sneaker.add(new Ask("9.5", 404));
        sneaker.add(new Ask("10", 404));

        Criteria size = new Size("9.5");
        Criteria sale = new Sales();
        Criteria sizeAndSales = new AndCriteria(size, sale);

        List<Offer> sizeAndSalesList = sizeAndSales.checkCriteria(sneaker);
        assertEquals("9.5", sizeAndSalesList.get(0).size());
        assertEquals("9.5", sizeAndSalesList.get(1).size());
        assertEquals(352, sizeAndSalesList.get(0).value());
        assertEquals(404, sizeAndSalesList.get(1).value());




    }
}
