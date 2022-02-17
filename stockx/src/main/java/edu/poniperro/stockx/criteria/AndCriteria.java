package edu.poniperro.stockx.criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import edu.poniperro.stockx.item.Item;
import edu.poniperro.stockx.item.Offer;

public class AndCriteria implements Criteria{
    
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otheCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otheCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {

        List<Offer> lista_anotherCriteria = new ArrayList<Offer>(otherCriteria.checkCriteria(item));
        List<Offer> lista_criteria = new ArrayList<Offer>(criteria.checkCriteria(item));

        Stream<Offer> lista_filtrada = lista_anotherCriteria.
                stream().
                filter(o -> o.size().equals(lista_criteria.get(0).size()));

        return lista_filtrada.collect(Collectors.toList());
        
    }
}
