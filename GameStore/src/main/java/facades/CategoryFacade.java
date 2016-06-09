/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import list.Categoria;

/**
 *
 * @author fabio
 */
@Stateless
public class CategoryFacade extends AbstractFacade<Categoria>{
    
    @PersistenceContext(unitName = "trabalho")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public CategoryFacade() {
        super(Categoria.class);
    }
    
    public List<Categoria> getCategoryByName(String jogo){
        Query query = em.createQuery("SELECT g FROM Category ct WHERE ct.Category_id = '" +jogo + "'");
        return query.getResultList();
    }
}
