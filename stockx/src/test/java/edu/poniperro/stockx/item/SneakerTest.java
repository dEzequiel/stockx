package edu.poniperro.stockx.item;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SneakerTest {
    
    @Test
    public void sneakerRepresentation() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        String expected = "Style: 555088-105" +"\n"+ "Name: Jordan 1 Retro High Dark Mocha";
        assertEquals(expected, sneaker.toString());
    }


}
