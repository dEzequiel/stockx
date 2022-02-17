package edu.poniperro.stockx.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.poniperro.stockx.item.Sale;
import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;

public class Sales implements Criteria{
    
    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                                    .filter(i -> i instanceof Sale)
                                    .collect(Collectors.toList());
    }

}
