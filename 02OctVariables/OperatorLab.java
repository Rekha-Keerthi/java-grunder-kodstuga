import javax.swing.text.StyledEditorKit;

public class OperatorLab {
    public static void main( String[] args){
        // Del 
        int a = 10; 
        int b = 3; 
        
        System.out.println(a + b); 
        System.out.println(a - b); 
        System.out.println(a * b); 
        System.out.println(a / b);
        System.out.println(a % b);

        //Del 2 – Remainder (%)

        int number = 17;

        System.out.println(number % 2);


        /*Frågor:

        Vad blir resultatet? : remainder är 1
        Vad händer om number ändras till 18? : Remainder blir : 0
        Vad kan % 2 användas till? By dividing with 2 it will give remainder either 0 or 1 , based on the remainder  we can verify whether dividend is Even or odd number
        */

        System.out.println("Vad blir resultatet? : remainder är 1");
        System.out.println("Vad händer om number ändras till 18? : Remainder blir when (18 % 2) : 0");
        System.out.println("Vad kan % 2 användas till?");
        System.out.println("By dividing with 2 it will give remainder either 0 or 1 , based on the remainder  we can verify whether dividend is Even or odd number");
        

        //Del 3 – Booleanexperiment

        int age = 20; 
        boolean test1 = age > 18; 
        boolean test2 = age < 18; 
        boolean test3 = age == 20; 
        boolean test4 = age != 20; 
        System.out.println(test1); 
        System.out.println(test2); 
        System.out.println(test3); 
        System.out.println(test4);

        //Testa sedan logiska operatorer:

        boolean hasTicket = true; 
        boolean isAdult = true; 
        boolean allowed = hasTicket && isAdult; 
        System.out.println(allowed);

        //Ändra värdena och prova även ||.

        boolean checkIfAllowed = hasTicket || isAdult; 
        System.out.println(checkIfAllowed);
    }
    
}
