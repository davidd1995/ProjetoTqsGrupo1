/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package external;
import list.Utilizador;
/**
 *
 * @author Jorge-pc
 */
public interface Payment {
    public double getInterestFeeds();
    public boolean setTargetBankAcount(int NIB);
    public double makePayment(Utilizador c, double amountToPay);
    
}
