/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 *
 * @author david-pc
 */
public class Negocio {
    
    private Leilao ll;
    private double precoFinal;

    public double getPrecoFinal() {
        return precoFinal;
    }

    public Negocio(Leilao ll){
        this.ll = ll;
        setPrecoFinal();
    }
    
    public void setPrecoFinal() {
        this.precoFinal = ll.getPrecoBase();
    }
    
    public Leilao getLl() {
        return ll;
    }
}
