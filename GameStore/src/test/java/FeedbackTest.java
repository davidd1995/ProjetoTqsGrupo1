/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import list.Feedback;
import list.Leilao;
import list.Negocio;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author sensez
 */
public class FeedbackTest {
    
    private Negocio neg;
    private Negocio nullNeg;
    private Feedback fb;
    private Leilao ll;
    
    @Before
    public void initialize(){
        ll = new Leilao();
        ll.setPrecoBase(100);
        neg = new Negocio(ll);
        fb = new Feedback();
        
    }
    
    @Test
    public void addNegocio(){
        fb.setNeg(neg);
        double preco = neg.getPrecoFinal();
        assertEquals("Negocio wasnt added sucessfuly" , fb.getNeg().getPrecoFinal(), preco);
    }
    
    @Test
    public void booleanTest(){
        fb.setIsPositive(true);
        assertTrue(fb.isIsPositive());
    }
    
    @After
    public void release(){
        neg = null;
        fb = null;
    }
}
