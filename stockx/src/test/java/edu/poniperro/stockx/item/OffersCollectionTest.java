package edu.poniperro.stockx.item;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OffersCollectionTest {
    
    @Test
    public void checkOffersSize() {
        Bid bid = new Bid("6", 200);
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        sneaker.add(bid);
        assertEquals(1, sneaker.offersSize());
    }
    
}
