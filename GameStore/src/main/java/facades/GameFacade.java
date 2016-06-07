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
import list.Games;

/**
 *
 * @author Jorge-pc
 */
@Stateless
public class GameFacade extends AbstractFacade<Games> {

    @PersistenceContext(unitName = "todos")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GameFacade() {
        super(Games.class);
    }
    
    public List<Games> getProductsByCategory(String jogo){
        Query query = em.createQuery("SELECT g FROM Games g WHERE g.Game_id = '" +jogo + "'");
        return query.getResultList();
    }
    
}

