

public class PersonCard {
    public static void main (String[] args){
        String firsName = "Rekha";
        String lastName = "Danappala";
        int age = 34;
        double height = 5.0;
        char grade = 'B';
        Boolean likesJava = true;

        System.out.println("Name: " + firsName + " " + lastName);
        System.out.println("Ålder: " + age + "yrs");
        System.out.println("Längd: " + height + "ft");
        System.out.println("Betyg: "+ grade);
        System.out.println("Gillar Java: " + likesJava);

        //Del 2: – Beräkna nästa års ålder

        int ageNextyear = age + 1;
        System.out.println("Nästa års ålder: " + ageNextyear + "yrs");

        String carBrand = "Volvo";
        int carModel= 2022; 
        double sellingPrice = 185000; 
        boolean isElectric = true;

        System.out.println("Car brand is : " + carBrand);
        System.out.println("Car model is : " + carModel);
        System.out.println("Price of the car : " + sellingPrice + " kr");
        System.out.println("Is is electric car? : " + isElectric);
        

        String newname = "Hello Welcome, to our Home";
        String regex = "[,]";
        System.out.println(newname.length());
        System.out.println(newname.charAt(10));
        System.out.println(newname.concat(carBrand));
        System.out.println(newname.contains("Home"));
        System.out.println(newname.indexOf("Welcome"));
        System.out.println(newname.indexOf('t'));
        System.out.println(newname.lastIndexOf("Welcome"));
        String[] myArray = newname.split(regex);
        System.out.println(myArray);
        for (String s : myArray) {
            System.out.println(s);
        }

        String newString = "Hello World,\"Welcome to Gothenburg\" ,\r thank you";
        System.out.println(newString);
    }   

}
