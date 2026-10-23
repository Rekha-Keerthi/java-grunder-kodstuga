package Vecka43Ovning;

public class Cow extends Animal{
    Cow(String namn)
    {
        super(namn);
    }

    @Override
    void makeSound() {
        System.out.println(namn + "makes MooMoo");
    }
    
}
