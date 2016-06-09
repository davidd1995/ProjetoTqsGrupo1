/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import list.Licitacao;


/**
 *
 * @author fabio
 */
public class LicitacaoFacade extends AbstractFacade<Licitacao> {
    
    @PersistenceContext(unitName = "trabalho")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public LicitacaoFacade() {
        super(Licitacao.class);
    }
}
