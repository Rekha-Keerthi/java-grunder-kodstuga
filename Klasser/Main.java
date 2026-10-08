package Klasser;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class Main {
    public static void main(String[] args) {
        Robot roboOne = new Robot("Nemo", 1500);
        roboOne.name = "Doris";
        //roboOne.batteri 
        roboOne.visaStatus();


        //Book class
        Book book = new Book();
        System.out.println("Default value of class variable for String when constructor is parameterless "+ book.bookName);
        System.out.println("Default value of class variables for String when constructor i parameterless "+ book.bookTitle);
        System.out.println("Default value of class variables for int  when constructor i parameterless " + book.yearpublished);

        //Student class:
        Student student = new Student("Johan", 34, 67);
        System.out.println("Student Name: " + student.name);
        System.out.println("Student Age: " + student.age);
        System.out.println("Student Grade: " + student.grade);


        //Car class
        Car carOne = new Car("cherry", 2000,"Fiat", "Red" );
        //Car carTwo = new Car("y", 2022, "Tesla", "black");
        System.out.println("Car Make: "+ carOne.make);
        System.out.println("Car model: "+ carOne.model);


        //Creating Instances of container class
        Container c = new Container();
        System.out.println(c.p1);
        System.out.println(c.p1);

    }
}
