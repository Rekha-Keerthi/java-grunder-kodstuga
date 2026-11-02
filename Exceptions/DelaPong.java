package Exceptions;

import java.io.IOException;

public class DelaPong {

    static int delaPoang(String text, int antal) {
        
        int poang = Integer.parseInt(text);

        if (antal <=0){
            throw new IllegalArgumentException("Antal måste vara över 0");
        }
        return poang / antal;
        
    }

    static void sparaResultat(int poang)
        throws java.io.IOException {
    try (java.io.FileWriter writer =
             new java.io.FileWriter("resultat.txt")) {
        writer.write("Poäng per spelare: " + poang);
    }
}


   

     public static void main(String[] args) {

        try{
        System.out.println(delaPoang("12", 0));
        }catch (ArithmeticException e)
        {
            System.out.println("Kan inte dela med noll! "); 
        } catch (NumberFormatException e) {
            System.out.println("Poängen måste vara ett tal!");
        }
        
        try{
            DelaPong.sparaResultat(10);
        }catch (IOException e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        


     }

    
}
