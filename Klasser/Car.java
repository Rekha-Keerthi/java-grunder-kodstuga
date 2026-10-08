package Klasser;

public class Car {
    String model;
    int year;
    String make;
    String color;

    public Car(int year, String make, String color){
        this("EX60", year, make, color);

    }

    public Car(String model, int year, String make, String color)
    {
        this.model = model;
        this.year = year;
        this.make = make;
        this.color = color;
    }
    
}
