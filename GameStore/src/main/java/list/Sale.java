/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.ManyToOne;

/**
 *
 * @author Jorge-pc
 */
   
@Entity
@XmlRootElement
public class Sale {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long saleId;
    @ManyToOne
    private Cliente cliente;
    @ManyToMany(fetch=FetchType.EAGER)
    private List<Games> listGames;

    public Sale(Cliente c){
        listGames = new ArrayList<>();
        cliente = c;
    }
    
    public Sale(){    
    }
    public Long getSaleId() {
        return saleId;
    }


    public Cliente getClient() {
        return cliente;
    }

    public double getTotalPayedAmount(){
        double amount = 0;
        for(Games games : listGames )
            amount += games.getPrice();
        return amount;
    }
    
    public int getProductAmount(Games g ){
        int amount = 0;
        for(Games games: listGames){
            if(games == g)
                amount++;
        }
        return amount;
    }
    
    public int getTotalproductAmount(){
        return listGames.size();
    }
    
    public void setClient(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Games> getListProduct() {
        return listGames;
    }

    public void setListProduct(List<Games> list) {
        this.listGames = list;
    }
    
    public void addGame(Games g){
        listGames.add(g);
    }
    
    public void removeGame(Games g){
        listGames.remove(g);
    }
    

    @Override
    public String toString() {
        return "{\"SaleId\":\"" + saleId +"\", \"ClientEmail\":\"" + cliente.getEmail() + "\", \"Products\":" + listGames + "}";
    }
}