/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import list.Feedback;


/**
 *
 * @author fabio
 */
public class FeedbackFacade extends AbstractFacade<Feedback> {
    
    @PersistenceContext(unitName = "trabalho")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public FeedbackFacade() {
        super(Feedback.class);
    }
}
    

