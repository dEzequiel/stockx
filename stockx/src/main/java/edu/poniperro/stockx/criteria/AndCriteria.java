package edu.poniperro.stockx.criteria;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;

public class AndCriteria implements Criteria{
    
    private Criteria criteria;
    private Criteria otheCriteria;

    public AndCriteria(Criteria criteria, Criteria otheCriteria) {
        this.criteria = criteria;
        this.otheCriteria = otheCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {

        //concatenate streams. checkCriteria returns a list, get the stream of that list with .stream() and concatenate them
        List<Offer> filterList = Stream.concat(this.criteria.checkCriteria(item).stream(),
                                                this.otheCriteria.checkCriteria(item).stream())
                                                                                                .collect(Collectors.toList());
        return filterList;
        
        
    }
}
