package edu.poniperro.stockx.item;

public class Sneaker {
    
    private String style;
    private final String name;
    private int sale;
    private int ask;
    private int bid;

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Style: ").append(this.style).append("\n");
        output.append("Name: ").append(this.name);

        return output.toString();

    }

}
