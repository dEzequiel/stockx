package edu.poniperro.stockx.criteria;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;

public class Min implements Criteria{
    private Criteria criteria;
    private Criteria anotherCriteria;
    public Min(Criteria criteria, Criteria anotherCriteria){
        this.criteria = criteria;
        this.anotherCriteria = anotherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        Criteria andCriteria = new AndCriteria(criteria, anotherCriteria);
        Optional<Offer> offer = andCriteria.checkCriteria(item)
                                                        .stream()
                                                        .min(Offer::compareTo);

        return offer.isPresent()? List.of(offer.get()) : List.of();

    }
}

