package Inheritance;

/*Hierarchical Inheritance */

public class Animal {

    void sound()
    {
        System.out.println("Animal makes sound ");
    }
    
}


 class Dog extends Animal{

    void sound()
    {
        System.out.println("Dog barks");
    }
    
}

 class Cat extends Animal{

    void sound()
    {
        System.out.println("Cat Meows");
    }
    
}

 class Cow extends Animal{

    void sound()
    {
        System.out.println("Cat Mooos");
    }
    
}


