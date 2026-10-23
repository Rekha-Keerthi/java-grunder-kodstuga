package Abstraction;

public class Main {

    public static void main(String[] args) {

        //here the reference of base class(Shape) is pointing or refers to the subclass object
        Shape s = new Circle("Red", 5);

        //Abstract class instance method is called with object of sublass(circle)
        s.getColor();

        //overriden method od subclass (Circle) is called with the base/parent class reference pointing to the subclass object
       System.out.println("area of circle " + s.area()); 


        // Base/parent class static method is called with classname without creating an object of abstract class (Shape)
       Shape.fun();


       /*
       The fun() method is declared as final, so Derived inherits it but cannot provide another implementation for it. The method is called using a Base reference that refers to a Derived object. */

       s.enjoy();
       
    }
    
}
