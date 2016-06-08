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
import list.Jogo;

/**
 *
 * @author Jorge-pc
 */
@Stateless
public class GameFacade extends AbstractFacade<Jogo> {

    @PersistenceContext(unitName = "trabalho")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GameFacade() {
        super(Jogo.class);
    }
    
    public List<Jogo> getGameByName(String jogo){
        Query query = em.createQuery("SELECT g FROM Games g WHERE g.Game_id = '" +jogo + "'");
        return query.getResultList();
    }
    
}

