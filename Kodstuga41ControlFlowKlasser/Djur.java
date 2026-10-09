package Kodstuga41ControlFlowKlasser;


public class Djur {
    String namn;
    int age ;
    String ljud;

    public Djur(String namn, int age,String ljud){
        this.namn = namn;
        this.age = age;
        this.ljud = ljud;
    }

    public void gorLjud(){
        System.out.println(namn + " says: " + ljud);

    }
    
    public static void main(String[] args) {
        Djur dog = new Djur("German shepherd",5, "Voffvoff");
        Djur goat = new Djur("goat", 6, "maa");

        dog.gorLjud();
        goat.gorLjud();
    }
}
