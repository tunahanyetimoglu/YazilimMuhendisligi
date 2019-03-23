/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yazilimmuhendislilab;

import java.util.Scanner;

/**
 *
 * @author tuhanan
 */
public class AccountTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Account account1 =  new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);
        System.out.printf("%s balance : $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance : $%.2f%n",
               account2.getName(), account2.getBalance());
        System.out.println("Enter debit amount for account1");
        double debitAmount = input.nextDouble();
        
        System.out.printf("%nextracting %.2f to account1 balance%n%n",debitAmount);
        account1.debit(debitAmount);
         System.out.printf("%s balance : $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance : $%.2f%n",
               account2.getName(), account2.getBalance());
        
        System.out.print("Enter deposit amount for account1 : ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n",depositAmount);
        account1.deposit(depositAmount);
         System.out.printf("%s balance : $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance : $%.2f%n",
               account2.getName(), account2.getBalance());
        System.out.print("Enter deposit amount for account2 : ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n",depositAmount);
        account2.deposit(depositAmount);
         System.out.printf("%s balance : $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance : $%.2f%n",
               account2.getName(), account2.getBalance());
        
    }
}
