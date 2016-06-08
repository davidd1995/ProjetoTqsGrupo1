/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package external;

//import contracts.POSContract;
import list.Utilizador;
/**
 *
 * @author Jorge-pc
 */
public class Pay {
    private Payment pay;
    public void setPos(Payment pay) {
        this.pay = pay;
    }
    
    public double getInterestFeeds(){
        return pay.getInterestFeeds();
    }
    
    public boolean setTargetBankAcount(int NIB){
        return pay.setTargetBankAcount(NIB);
    }
    
    public double makePayment(Utilizador c, double amountToPay){
        return pay.makePayment(c, amountToPay);
    }
    
}
