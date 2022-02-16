package edu.poniperro.stockx.item;

public class Ask implements Offer{
    private String size;
    private Integer ask;

    public Ask(String size, int ask) {
        this.size = size;
        this.ask = ask;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.ask.intValue();
    }

    @Override
    public String toString() {
        return "\t\t" + size() + "\t" + Integer.toString(value()) + "\n";
    
    }
}
