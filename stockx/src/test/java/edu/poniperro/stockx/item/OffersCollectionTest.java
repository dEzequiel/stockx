package edu.poniperro.stockx.item;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OffersCollectionTest {
    
    @Test
    public void checkOffersSize() {
        Bid bid = new Bid("6", 200);
        Ask ask = new Ask("6", 200);
        Sale sale = new Sale("6", 200);


        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        sneaker.add(bid);
        sneaker.add(ask);
        sneaker.add(sale);
        assertEquals(3, sneaker.offersSize());
    }
    
}
