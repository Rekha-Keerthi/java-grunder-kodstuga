package Vecka43Ovning.Ovning4;

abstract class Animal {

    abstract void makeSound();
     
}


public interface Playable {
    
    void play();  
}

class Dog extends  Animal implements  Playable{
    
    @Override
    void makeSound() {
        System.out.println("Dog makes VoffVoff");
    }

    public void play()
    {
        System.out.println("Dog likes to play in the puddle");
    }

    
}


class Cat extends  Animal{
    @Override
    void makeSound() {
        System.out.println("Cat makes Meow");
    }
}


