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
import list.Cliente;

/**
 *
 * @author Jorge-pc
 */
@Stateless
public class ClienteFacade extends AbstractFacade<Cliente> {

    @PersistenceContext(unitName = "todos")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClienteFacade() {
        super(Cliente.class);
    }

    public boolean validUser(String user) {

        Query query = em.createQuery("SELECT c FROM Client c WHERE c.user = '" + user + "'");
        List<Cliente> c = query.getResultList();
        return c.size() < 1;
    }

    public boolean clientExists(String user) {

        Query query = em.createQuery("SELECT c FROM Client c WHERE c.user = '" + user + "'");
        List<Cliente> c = query.getResultList();
        return !c.isEmpty();
    }

    public Cliente getClientByUser(String user) {

        Query query = em.createQuery("SELECT c FROM Client c WHERE c.user = '" + user + "'");
        Cliente c = (Cliente) query.getSingleResult();
        return c;
    }

    public boolean validLogin(String user, String password) {
        
        if(clientExists(user)){
            Query query = em.createQuery("SELECT c FROM Client c WHERE c.user = '" + user + "' "
                    + "AND c.password = '"+ password +"'");
            Cliente c = (Cliente) query.getSingleResult();

            if (password.equals(c.getPass())){
                System.out.println("logged");
                return true;
            }
            return false;
        }
        
        return false;    
    }

}
