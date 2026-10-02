

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
        
    }   

}
