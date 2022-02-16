package edu.poniperro.stockx.item;

public class Sale implements Offer{
    private String size;
    private Integer price;

    public Sale(String size, int price) {
        this.size = size;
        this.price = price;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.price;
    }
}