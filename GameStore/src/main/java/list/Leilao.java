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
public class Leilao {
 
    private Jogo jogo;
    private String dt;
    private double precoBase;
    private Licitacao vencedora;
    private Utilizador vendedor;
    
    public Licitacao getVencedora() {
        return vencedora;
    }

    public void setVencedora(Licitacao vencedora) {
        this.vencedora = vencedora;
    }
    
    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
    
    public Utilizador getVendedor(){
        return vendedor;
    }
    public void setVendedor(Utilizador user){
            this.vendedor=user;
    }
}
