/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yazilimmuhendislilab;

/**
 *
 * @author tuhanan
 */
public class Account{
        private String name;
        private double balance;
        
        public Account(String name, double balance){
            this.name = name;
            
            if(balance > 0.0)
                this.balance = balance;
        }
        public void debit(double debitAmount){
            if(debitAmount > balance || debitAmount < 0.0){
                System.out.println("Debit amount exceed account balance");
            }else{
                balance = balance - debitAmount;
            }
        }
        public void deposit(double depositAmount){
            if(depositAmount > 0.0)
                balance = balance + depositAmount;
        }
        public double getBalance(){
            return balance;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
}