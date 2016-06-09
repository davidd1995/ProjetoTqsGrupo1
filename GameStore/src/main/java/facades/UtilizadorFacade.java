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
import list.Utilizador;

/**
 *
 * @author Jorge-pc
 */
@Stateless
public class UtilizadorFacade extends AbstractFacade<Utilizador> {

    @PersistenceContext(unitName = "trabalho")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UtilizadorFacade() {
        super(Utilizador.class);
    }

    public boolean validUser(String userName) {

       // Query query = em.createQuery("SELECT c FROM Client c WHERE c.user = '" + userName + "'");
       // List<Utilizador> c = query.getResultList();
        return true ;//c.size() < 1;
    }

    public boolean clientExists(String userName) {

        //Query query = em.createQuery("SELECT c FROM Client c WHERE c.user = '" + user + "'");
       // List<Cliente> c = query.getResultList();
        String c= "Antonio";
        return c.equals(userName);
    }

    public Utilizador getClientByUser(String user) {

        Query query = em.createQuery("SELECT c FROM Client c WHERE c.user = '" + user + "'");
        Utilizador c = (Utilizador) query.getSingleResult();
        return c;
    }

    public boolean validLogin(String userName, String password) {
        
        if(clientExists(userName)){
            
          //  Query query = em.createQuery("SELECT c FROM Client c WHERE c.user = '" + user + "' "
          //          + "AND c.password = '"+ password +"'");
          //  Cliente c = (Cliente) query.getSingleResult();
            String c="123";
            if (password.equals(c)){
                System.out.println("logged");
                return true;
            }
            return false;
        }
        
        return false;    
    }

}
