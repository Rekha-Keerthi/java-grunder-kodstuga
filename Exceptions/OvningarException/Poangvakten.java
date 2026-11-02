package Exceptions.OvningarException;

public class Poangvakten {
    static void checkScore(int score){
        if (score < 0 || score >100)
        {
            throw new IllegalArgumentException("\"Antal måste vara mellan 0 och 100\"");
        }
        else
        {
            System.out.println("Valid score input is between 0 och 100 " + score);
        }
    }
    public static void main(String[] args) {
        /*  int number = 10/0;
        System.out.println(number);
       */
        // problem detected at runtime
        //int[] values = new int[3];
        //System.out.println(values[3]);

        double price = 19.95;
        System.out.println(price);

        checkScore(45);
        try{
            checkScore(-1);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }finally{
            System.out.println("Programmet Avslutas!");
        }
        
    }
}
