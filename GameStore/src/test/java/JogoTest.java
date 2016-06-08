/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import list.Categoria;
import list.Jogo;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author sensez
 */
public class JogoTest {
    
    private Jogo jogo;
    private Jogo nullJogo;
    private Categoria ct;
    
    @Before
    public void initialize(){
        jogo = new Jogo();
        nullJogo = new Jogo();
        ct = new Categoria();
        ct.setNome("Ação");
        jogo.setCategoria(ct);
        jogo.setDesc("Jogo muita louco");
        jogo.setNome("GTA5");
        jogo.setPlataforma("PS4");
        jogo.setReq("PC moderado, cpu xpto bla bla bla");
    }
    
    @Test
    public void testingCategory(){
        assertEquals("Categoria não foi adicionada corretamente", jogo.getCategoria().getNome(), ct.getNome());
    }

    @Test(expected = NullPointerException.class)
    public void accessNull(){
        nullJogo.getCategoria();
    }
    
    @After
    public void release(){
        jogo = null;
        nullJogo = null;
        ct = null;
    }
}
