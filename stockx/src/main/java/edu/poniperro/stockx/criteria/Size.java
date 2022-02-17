package edu.poniperro.stockx.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;

public class Size implements Criteria{
    
    private String size;

    public Size(String size) {
        this.size = size;
    }

    private String getSize() {
        return this.size;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                                    .filter(i -> i.size() == getSize())
                                    .collect(Collectors.toList());
    }   
}
