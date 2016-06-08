/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insert;
import list.Utilizador;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import list.Jogo;

/**
 *
 * @author Jorge-pc
 */
public class Insert {
    
    public static void main(String[] args) throws Exception {
        
        Class.forName("com.mysql.jdbc.Driver");
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.mycompany_GameStore_war_1.0-SNAPSHOTPU");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();

        Query q = em.createQuery("SELECT r FROM Lista r");

        boolean createNewEntries = (q.getResultList().size() == 0);

        if (createNewEntries) {
         //   Utilizador x = new Utilizador("Zé Miguel","123");

    
            //em.persist(x);
            for (int i = 1; i <= 3; i++) {
                Jogo jogo = new Jogo();
                jogo.setNome("Jogo" + i);
                em.persist(jogo);
                em.persist(jogo);
                //em.persist(x);
            }

        }

        em.getTransaction().commit();
        Query query = em.createQuery("SELECT r FROM Lista r");
        System.out.println(query.getResultList());
        
        em.close();
    }

}