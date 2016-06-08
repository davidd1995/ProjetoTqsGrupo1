/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import list.Licitacao;
import list.Utilizador;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author sensez
 */
public class LicitacaoTest {
    
   private Utilizador user;
   private Licitacao lic;
   private Licitacao nullLic;
   
   @Before
   public void initialize(){
       user = new Utilizador();
       lic = new Licitacao();
       user.setNome("joao");
       lic.setLicitacao(100);
       nullLic = new Licitacao();
   }
   
   @Test
   public void addTest(){
       String nome = user.getNome();
       lic.setLicitador(user);
       assertEquals("Licitacao user aint the same", lic.getLicitador().getNome(), nome);
   }
   
   @Test(expected = NullPointerException.class)
   public void addLicitacao(){
       double preco = nullLic.getLicitacao();
   }
   
   @After
   public void release(){
       lic = null;
       user = null;
       nullLic = null;
   }
}
