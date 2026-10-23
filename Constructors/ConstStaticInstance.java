package Constructors;

public class ConstStaticInstance {

    //static variable 
    static int num =10;
    //instance variable 
    int a =20;

    //static method 
    static void display()
    {
        System.out.println("This is a static method");
        //displaying static variable
        System.out.println("The value of static variable num: " + num);
    }

    //instance method , here the instance method can access both static (class variable) and instance variable 
    public int sumofNumbers(int num, int a){
        System.out.println("The value of static variable num: " + num);
        System.out.println("The value of instance variable a: " + a);


        //instance variable can access the static method 
        display();
        return num+a;
    }

    public static void main(String[] args) {
        // we can static method without creating a object directly by calling a static method name, as the static variables and methods belongs to the class
        display();  
        //we can also access or call static variables and methods thats belongs to the class , using a classname 
        ConstStaticInstance.display();  
        System.out.println(ConstStaticInstance.num);

        // Instance variables and methods are accessible only creating a object.
        ConstStaticInstance obj1 = new ConstStaticInstance();
        int sum = obj1.sumofNumbers(100, 200);
        System.out.println(sum);
    }

    
}
