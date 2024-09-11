/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeane
 */
public class PaymentCard {
    private double balance;
    private final double eatAffordably;
    private final double eatHeartily;
    
    
    public PaymentCard(double openingBalance){
        this.balance = openingBalance;
        this.eatAffordably = 2.60;
        this.eatHeartily = 4.60;
   
    }
    public void eatAffordably(){
        if(this.balance>=eatAffordably){
        this.balance-=eatAffordably;
        }
    }
    public void eatHeartily(){
        if (this.balance>=eatHeartily){
        this.balance-=eatHeartily;
        }
        
    }
    public void addMoney(double amount){
        if(amount> -1)
            this.balance+=amount;
            if(this.balance>=150){
                this.balance = 150;
            }else{
                amount = 0;
            }
            
       
    }
     
    public String toString(){
        return "The card has a balance of "+this.balance+" euros";
    }
    
    
    
}
