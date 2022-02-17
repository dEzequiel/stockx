package edu.poniperro.stockx.criteria;

import java.util.List;
import java.util.stream.Collectors;

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

        List<Offer> criteriaList = this.criteria.checkCriteria(item);
        List<Offer> otherCriteriaList = this.otheCriteria.checkCriteria(item);
        
        return criteriaList.stream().filter(otherCriteriaList::contains).collect(Collectors.toList());
        
    }
}
