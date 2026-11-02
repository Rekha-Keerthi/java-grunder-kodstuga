package Exceptions.OvningarException;

import java.util.Scanner;

public class Bankvalvet {

    static void withdraw(int balance, int amount){
        if( amount <=0){
            throw new IllegalArgumentException("The entered amount is negative");
        }
        else if( amount > balance){
            throw new IllegalArgumentException("The entered amount exceeds the balance");

        }
        else
        {
            System.out.println("The amount is withdrawn successfully");
        }
    }

    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the balance: ");
            int balance = s.nextInt();
            System.out.println("Enter the amount to withdraw");
            int amount = s.nextInt();
            withdraw(balance, amount);
        }
        catch (IllegalArgumentException e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally
        {
            System.out.println("Withdrawal attempt has concluded");
        }
    }
    
}
