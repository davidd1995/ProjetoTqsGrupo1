/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;


import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jorge-pc
 */
@Entity
@XmlRootElement
public class Games {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Jogo;
    private Plataform ID_Plataforma;
    private Type genero;
    private String Nome;
    private String descricao;
    private String requesitos;
    private double preco;
    private String imageUrl;
    //@ManyToMany(fetch=FetchType.EAGER)
   
    
      public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getGameId() {
        return ID_Jogo;
    }
    public Type getGeneral() {
        return genero;
    }
    public void setDescription(String description){
        this.descricao = description;
    }

    public Plataform getPlataform() {
        return ID_Plataforma;
    }
    public String getSpecification() {
        return requesitos;
    }
    
    public String getDescription(){
        return descricao;
    }

    public String getName() {
        return Nome;
    }

    public void setName(String name) {
        this.Nome = name;
    }

    public double getPrice() {
        return preco;
    }

    public void setPrice(double price) {
        this.preco = price;
    }

  

    
    public void setNome(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 @Override
    public String toString() {
        return "{\"GameId\":\"" + ID_Jogo + "\", \"Name\":\"" + Nome + "\",\"Price\":\"" + preco + "\","
                + "\"Description\":\"" + descricao + "\",\"imageURL\":\"" + imageUrl + "\"" +"\",\"Genero\":\"" + genero +"\",\"Requesitos\":\"" + requesitos+"\"" +'}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.ID_Jogo);
        hash = 59 * hash + Objects.hashCode(this.Nome);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.preco) ^ (Double.doubleToLongBits(this.preco) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.descricao);
        hash = 59 * hash + Objects.hashCode(this.genero);
        hash = 59 * hash + Objects.hashCode(this.requesitos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Games other = (Games) obj;
        if (Double.doubleToLongBits(this.preco) != Double.doubleToLongBits(other.preco)) {
            return false;
        }
        if (!Objects.equals(this.Nome, other.Nome)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.ID_Jogo, other.ID_Jogo)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        if (!Objects.equals(this.requesitos, other.requesitos)) {
            return false;
        }
        return true;
    }
    
    

    

    
    
}
