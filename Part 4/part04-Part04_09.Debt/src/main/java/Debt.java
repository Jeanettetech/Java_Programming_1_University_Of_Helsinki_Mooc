/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeane
 */
public class Debt {
    private double balance;
    private double interestRate;
    
    public Debt(double initialbalance, double initialInterestRate){
        this.balance = initialbalance;
        this.interestRate = initialInterestRate;
    }
    
    public void printBalance(){
        System.out.println(balance);
    }
    public void waitOneYear(){
        this.balance*= interestRate;
        
    }
            
    
}
