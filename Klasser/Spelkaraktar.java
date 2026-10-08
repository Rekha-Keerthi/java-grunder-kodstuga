package Klasser;

public class Spelkaraktar {

    String name;
    int livs;

    public Spelkaraktar(int livs)
    {
        this("Nemo", livs);
    }

    public Spelkaraktar(String name , int livs)
    {
        this.name = name;
        this.livs = livs;
    }

    public void presentera(){

        System.out.println("Spelkaratar är:" + name + " and its life time is " + livs);
    }

    public static void main(String[] args) {
        Spelkaraktar karatarOne = new Spelkaraktar(50);
       Spelkaraktar KaratarTwo = new Spelkaraktar("Mario", 60);

        karatarOne.presentera();
        KaratarTwo.presentera();
    }
    
}
