package Oct12Metoder;

public class Overloading {

    static int showPower(int strength)
    {
        return strength;
    }

    static String showPower(String strength)
    {   
        
        return strength;
    }
    

    public static void main(String[] args) {
        Overloading callMethod = new Overloading();
        System.out.println(callMethod.showPower(10));
        System.out.println(callMethod.showPower("30"));
    }
}
