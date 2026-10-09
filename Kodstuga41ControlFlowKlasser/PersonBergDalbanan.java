package Kodstuga41ControlFlowKlasser;

public class PersonBergDalbanan {

    public static void main(String[] args) {
    int personAge = 18;
    float height= 5.6f;

    if (personAge>=18 && height>5)
    {
        System.out.println("Personen får åka berg- och-dalbanan");
    }
    else if (personAge>18 || height<5 )
    {
        System.out.println("Personen behöver tillåtelse från föräldrar ");
    }
    else{
        
        System.out.println("Personen får inte åka berg- och-dalbanan");
    }
    }
    
}
