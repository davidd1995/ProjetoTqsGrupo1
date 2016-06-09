/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import list.Negocio;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import list.Leilao;


/**
 *
 * @author david-pc
 */
@Stateless
public class LeilaoFacade extends AbstractFacade<Leilao> {

    @PersistenceContext(unitName = "trabalho")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LeilaoFacade() {
        super(Leilao.class);
    }
    
}

