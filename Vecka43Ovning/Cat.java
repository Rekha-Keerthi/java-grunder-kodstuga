package Vecka43Ovning;

public class Cat extends Animal{

    Cat(String namn)
    {
        super(namn);
    }

    @Override
    void makeSound() {
        System.out.println(namn + "makes Meow");
    }
    
}
