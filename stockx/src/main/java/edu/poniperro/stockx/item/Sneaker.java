package edu.poniperro.stockx.item;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item{
    
    private String style;
    private final String name;
    private int sale;
    private int ask;
    private int bid;
    private List<Offer> offers = new ArrayList<Offer>();

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Style: ").append(this.style).append("\n");
        output.append("Name: ").append(this.name);

        return output.toString();

    }
    
    @Override
    public List<Offer> offers() {
        return this.offers;
    }


    @Override
    public void add(Offer offer) {
        offers().add(offer);
    }

    @Override
    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public int getBid() {
        return this.bid;
    }

}
