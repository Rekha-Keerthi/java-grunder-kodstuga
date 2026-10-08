package Klasser;

public class Djur {
    String ljud;

    public Djur(String ljud){
        this.ljud = ljud;
    }

    public void gorLjud(){
        System.out.println(ljud);

    }
    
    public static void main(String[] args) {
        Djur dog = new Djur("Voffvoff");
        Djur cat = new Djur("Meow");

        dog.gorLjud();
        cat.gorLjud();
    }
}
