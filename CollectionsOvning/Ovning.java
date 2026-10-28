package CollectionsOvning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Ovning {

    public static void main(String[] args) {
        System.out.println(" \"Collection\" is a Interface in java.util");
         System.out.println(" \"Collections\"  is a Class in java.util");

        //Set is interface, HashSet is a class
        Set<Object>  myset = new HashSet<>(); //With Set<Object> mySet can contain objects of different reference types.


        Set<String> mynewset = new HashSet<>(); // With generic types, listed within <>, we determine what type of elements the collection can contain.

        //Integer within <> specified as primitive wrapper type, We can use primitive data types such as int, double, float 

        /*All the primitive variables have a corresponding wrapper class that can be used when you need reference type objects. */
        System.out.println("int -> Integer\r\n" + //
                        "char > Character\r\n" + //
                        "boolean -> Boolean\r\n" + //
                        "double -> Double\r\n" + //
                        "String…?");

        //String is already a class, i.e. a reference type!)
        Set<Integer> myIntegerList = new HashSet<>();

        

        //We can declare the variable as Set and create the object with the constructor in HashSet.
        Set<String> colors = new HashSet<>();

        colors.add("Röd");
        colors.add("Blå");
        /* A Set does not allow duplicates according to equals() (and hashCode() is used in HashSet).
        (HashSet allows a maximum of one null element.)
        */
        colors.add("Röd"); // Samma värde igen.
        System.out.println(colors);
        System.out.println("Antal färger: " + colors.size());

        /*As with Set, List is an interface. This means that we don't instantiate List. Instead, we use the arrayList class. */
        //List allows duplicate values
        List<String> names = new ArrayList<String>();
        names.add("Ibbani");
        names.add("Rekha");
        names.add("Johan");

        //print the size of an List
        System.out.println("antal namn: "+ names.size());

        //check whether the list contains the Johan
        System.out.println("Check if Johan "+ names.contains("Johan"));

        //remove the name  from the list
        names.remove("Ibbani");
        System.out.println("Printing list after removing name " + names);

        //Queue
        Queue<String> firstqueue = new LinkedList<>();
        firstqueue.offer("Rani");
        firstqueue.offer("Raja");
        firstqueue.offer("roarer");
        firstqueue.offer("rocket");

        //print the queue on the console
        System.out.println("Elements in the queue"+ firstqueue);

        //fetches and remove element from queue
        firstqueue.poll();
        System.out.println("Elements in the queue"+ firstqueue);

        //retrieves or fetches the first element, but doest not remove it from from the queue
        System.out.println("First element in the queue: "+ firstqueue.peek());

    

    }
    
}
