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

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }
    
    public Leilao getLl() {
        return ll;
    }

    public void setLl(Leilao ll) {
        this.ll = ll;
    }
}
