/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import list.Leilao;
import list.Licitacao;
import list.Negocio;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author sensez
 */
public class NegocioTest {
    
    private Licitacao lic;
    private Leilao ll;
    private Negocio ng;
    private Negocio ngNull;
    
    @Before
    public void initialize(){
        ll = new Leilao();
        lic = new Licitacao();
        lic.setLicitacao(100);
        ll.setVencedora(lic);
        ng = new Negocio(ll);        
    }
    
    @Test
    public void verifyPreco(){
        assertEquals("it should be the same price when negocio is created", ll.getPrecoBase(), ng.getPrecoFinal());
    }
    
    @Test
    public void verifyAdd(){
        ngNull = new Negocio(ll);
        assertTrue(ngNull.getLl() != null);
    }    
    
    @After
    public void relase(){
        ngNull = null;
        ng = null;
        ll = null;
        lic = null;
    }
}
