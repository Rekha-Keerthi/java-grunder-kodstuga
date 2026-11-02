package Exceptions;

public class FleraTryCatch {

    public static void main(String[] args) {

        String text = "hej"; // byt till "12"
    int antalSpelare = 0;

        try {
                int poang = Integer.parseInt(text);
                System.out.println(poang / antalSpelare);
                } 
                catch (NumberFormatException e) {
                System.out.println("Poängen måste vara ett tal!");
                } 
                catch (ArithmeticException e) {
                System.out.println("Antalet får inte vara 0!");
            }
            finally {
    System.out.println("Försöket avslutat.");
}

    }
    
}
