/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import list.Jogo;
import list.Leilao;
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
public class LeilaoTest {
    
    private Jogo jogo;
    private Licitacao lic;
    private Utilizador user;
    private Leilao ll;
    
    @Before
    public void initialize(){
        ll = new Leilao();
        jogo = new Jogo();
        jogo.setNome("GTA5");
        lic = new Licitacao();
        user = new Utilizador();
        lic.setLicitacao(100);
        
    }
    
    @Test
    public void testingPrice(){
        double preco = lic.getLicitacao();
        ll.setVencedora(lic);
        assertEquals("Price wasnt changed successfully", preco, ll.getPrecoBase());
    }
    
    @Test
    public void testAddJogo(){
        String name = jogo.getNome();
        assertEquals("Game wasnt added succesfully", name , ll.getJogo().getNome());
    }
    
    @After
    public void release(){
        ll = null;
        user = null; 
        lic = null; 
        jogo = null;
    }
}
