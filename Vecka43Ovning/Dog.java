package Vecka43Ovning;

public class Dog extends Animal {

    Dog(String namn)
    {
        super(namn);
    }
    
    @Override
    void makeSound() {
        System.out.println(namn + "makes VoffVoff");
    }
}
