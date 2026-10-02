

public class BugHunt {
    public static void main(String[] args) { 
        String name = "Ada"; // Syntax error, String data Type should start with Capital 'S' and the code line should with semi-colon 
        int age = 25; // Integers value should not be declared in double or single quotes.  which is incorrect. Removed double quotes
        double height = 1.72; // Decimal values should use . to separate whole number and fraction parts
        char grade = 'A'; // char should always be declared in single quotes 
        boolean likesJava = true; // boolean value is initialized in double quotes, which is incorrect , removed double quotes so it is treated as true boolean value
        int apples = 5; 
        int bananas = 2; 
        System.out.println("Fruit: " + (apples + bananas)); // Fruits is addition integers apples and banana, arithmetic operations should always be written within two parentheses
        System.out.println("Name: " + name); // Strings are concatenated with '+' sign
        System.out.println(age == 25); }
}
