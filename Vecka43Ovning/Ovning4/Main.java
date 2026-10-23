package Vecka43Ovning.Ovning4;

public class Main {

    public static void main(String[] args) {
        
        Playable dog = new Dog();
        Animal cat = new Cat();

        dog.play();
        cat.makeSound();
        showTalent(new Dog());
        
        
        
    }

    public static void showTalent(Playable participant)
        {
            
            participant.play();
        }
    
}
