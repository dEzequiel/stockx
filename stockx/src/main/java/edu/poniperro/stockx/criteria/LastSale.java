package edu.poniperro.stockx.criteria;

import java.util.List;

import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;

public class LastSale implements Criteria {
    
    @Override
    public List<Offer> checkCriteria(Item item) {
        
        Criteria sales = new Sales();

        List<Offer> salesList = sales.checkCriteria(item);

        return salesList.isEmpty()? List.of() : List.of(salesList.get(salesList.size() - 1));
    }
}
