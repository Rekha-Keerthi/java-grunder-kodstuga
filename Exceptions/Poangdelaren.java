package Exceptions;
public class Poangdelaren {
    public static void main(String[] args) {
        String text = "12";
        int antalSpelare = 0;

        try{
            int poang = Integer.parseInt(text);
            System.out.println(poang / antalSpelare);
        } catch (ArithmeticException e)
        {   

            //getMessage() retrieves a short error description (String).
            //getMessage() provides the error text, but does not display the file name or line number.
            System.out.println("Exception error thrown when the code ran: " + e.getMessage());


            //printStackTrace() skriver feltyp, metoder, fil och radnummer.
            e.printStackTrace();

            System.out.println("Kan inte dela med noll! ");
        }
        System.out.println("Programmet fortsätter.");
    }

    
}
