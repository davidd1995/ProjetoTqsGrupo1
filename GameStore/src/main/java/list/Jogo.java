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
public class Jogo {
    
   private String nome;
   private String desc;
   private String req;
   private String plataforma;
   private Categoria ct;

  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getReq() {
        return req;
    }

    public void setReq(String req) {
        this.req = req;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
    public void setCategoria(Categoria ct){
        this.ct = ct;
    }
    
    public Categoria getCategoria(){
        return ct;
    }
}
