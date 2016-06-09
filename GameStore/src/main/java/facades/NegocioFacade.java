/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import list.Negocio;

/**
 *
 * @author fabio
 */
public class NegocioFacade extends AbstractFacade<Negocio>{
    
    @PersistenceContext(unitName = "trabalho")
    private EntityManager em;

    public NegocioFacade() {
        super(Negocio.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
