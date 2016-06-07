/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;


import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author Jorge-pc
 */
@Entity
@XmlRootElement
public class Cliente extends User{
    private Car car;
    public Cliente(){
        super();
    }
    public Cliente( String email, String password){
        super(email,password);
    }
    
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    
    @Override
    public String toString() {
        return "{\"ClientId\":\"" + super.getUserId() + "\", \"Name\":\"" + super.getName()+ "\", \"Email\":\"" + super.getEmail() + "\","
                + " \"Address\":\"" + super.getAddress() + "\"}";
    }   
}