package Exceptions.OvningarException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Minicounter {

    static float dividePoang(int a, int b)
    {
        return a / b;
    }
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ange poäng: ");
        int dividend = s.nextInt();
        int divisor = s.nextInt();
        try{
        System.out.println(dividePoang(dividend, divisor));
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("Kan inte dela med noll! ");
        }catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println("Poängen måste vara ett tal!");
        }finally
        {
            System.out.println("Programmet är klart.");
        }
    }
}
