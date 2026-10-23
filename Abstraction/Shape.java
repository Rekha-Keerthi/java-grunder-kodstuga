package Abstraction;

abstract class Shape {

    
    //instance variable
    String color;

    // Constructor
    Shape(String color) {
        this.color = color;
    }

    //abstract method without body
    abstract double area();


    //instance method
    void getColor()
    { 
        System.out.println("Color "+ color);
    }

   
    //static method 
    static  void fun()
    {
        System.out.println("This is static method of abstract class");
    }


    //An abstract class can contain a final method. A final method cannot be overridden by its subclasses.
    final void enjoy()
    {
        System.out.println("Base enjoy() called");
    }

    
}
