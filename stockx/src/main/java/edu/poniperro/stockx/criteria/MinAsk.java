package edu.poniperro.stockx.criteria;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import edu.poniperro.stockx.item.Ask;
import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;

public class MinAsk implements Criteria {
    
    @Override
    public List<Offer> checkCriteria(Item item) {
        Comparator<Offer> comparator = Comparator.comparing(Offer::value);

        return item.offers().stream()
                                    .filter(i -> i instanceof Ask)
                                    .min(comparator)
                                    .stream().collect(Collectors.toList());
    }
}
