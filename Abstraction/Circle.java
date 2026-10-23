package Abstraction;



 class Circle extends Shape{

    int radius;

    Circle(String color , int radius){
        super(color);
        this.radius = radius;
    }

    double area(){
        
        return Math.PI * radius * radius;
    }
}