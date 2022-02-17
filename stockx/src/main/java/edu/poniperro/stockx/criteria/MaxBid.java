package edu.poniperro.stockx.criteria;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import edu.poniperro.stockx.item.Bid;
import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;

public class MaxBid implements Criteria{
    
    @Override
    public List<Offer> checkCriteria(Item item) {
        //wrap only 'bid values' to compare
        Comparator<Offer> comparator = Comparator.comparing(Offer::value);  // important!! you get type object value method that return 
                                                                            // object values
        return item.offers().stream()
                                    .filter(i -> i instanceof Bid)
                                    .max(comparator)
                                    .stream().collect(Collectors.toList());

    }
}
