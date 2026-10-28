package Constructors;

public class Geeks {
    int a;
    int b;

    // Default constructor
    Geeks()
    {
        a = 10;
        b = 20;
    }

    // Method that receives "this"
    // keyword as parameter
    void display(Geeks obj)
    {
        System.out.println("a = " + obj.a
                           + "  b = " + obj.b);
    }

    // Method that returns current class instance
    void get() { 
        display(this); 
    }

    // main function
    public static void main(String[] args)
    {
        Geeks object = new Geeks();
        object.get();
        
    }
} 
