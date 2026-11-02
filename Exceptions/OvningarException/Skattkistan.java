package Exceptions.OvningarException;

public class Skattkistan {

    /*1. Försök skriva ut elementet på index 5 och kör programmet.

2. Läs felmeddelandet i terminalen. Vilken exception-typ får du?

3. Lägg den riskabla raden i ett try-block.

4. Fånga felet med catch (ArrayIndexOutOfBoundsException e).

5. Skriv ut ett eget meddelande och även e.getMessage().

Fundera: Är detta ett kompileringsfel eller ett fel som uppstår under körning? */

    public static void main(String[] args) {
        int[] treasure = {100,200,300};

        try{
            System.out.println(treasure[5]);
        }catch (ArrayIndexOutOfBoundsException e)
        {
           System.out.println(e.getMessage()); 
        }
        
    }
    
    
}
