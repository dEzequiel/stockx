package edu.poniperro.stockx.criteria;

import java.util.List;

import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;

public interface Criteria {
    List<Offer> checkCriteria(Item item);
}
