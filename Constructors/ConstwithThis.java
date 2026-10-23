package Constructors;

import Inheritance.Geeks;

public class ConstwithThis {

    //instance variable 
    int a;
    int b;


    //Default constructor without paramenters
    ConstwithThis()
    {

        
        System.out.println("This is default constructor");

        //If I initialize the values int the values default constructor
        a=3333;
        b=4444;
        //calling a current class constructor using a this keywords;
        //this(40, 50);
    }

     // Method that returns current class instance with the values initialized int the default constructor 
    ConstwithThis get() { 
        return this; 
    }

    //parametersised constructor . here the parameter names is as the instance variable
    ConstwithThis(int a, int b)
    {
        //this keyword is used to refer current class instance variable
        this.a=a;
        this.b=b;
        System.out.println("This is parameterised constructor");

    
    }

    //instance method
    void display()
    {
        System.out.println("a = " + a + " and "  + " b = " + b);  // here were are printing the value of objects instance variable calling the parameterised constructor
        this.show(get());
    }


    //we can pass the current class object as a parameter to the instance method using this keyword
    void show(ConstwithThis obj)
    {
        
        System.out.println("a = " + obj.a + " and "  + " b = " + obj.b);  // here were are printing the value of objects instance variable calling the parameterised constructor
    }

    void getObjectInstace()
    {
        show(this);
    }


    public static void main(String[] args) {
        //creating an object of the class with default constructor
        ConstwithThis obj1=new ConstwithThis();
        //The method get() returns the current object using this, so object.get() refers to the same Geeks instance created in main. 
        // Calling display() on it prints the values of a and b that were initialized in the default constructor.
        obj1.get().display();

        //The get() method passes this to display(this). Thus, the current Geeks object is passed to the display() method, where its instance variables are accessed through obj.
        obj1.getObjectInstace();;

        //creating an object of the class with parameterised constructor
        ConstwithThis object2 = new ConstwithThis(1000, 4000); // we are passing the parameter of the constructor

        //obj1.display();
        object2.display();
    }
    
}
