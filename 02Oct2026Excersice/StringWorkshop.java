
public class StringWorkshop {
    public static void main(String[] args) { 
        String firstName = "Anna"; 
        String lastName = "Andersson"; 
        String fullName = firstName + " " + lastName; 
        System.out.println(fullName); 
        System.out.println(fullName.length());

        /*Bygg sedan utskrift som ser ut ungefär så här:
        Hej! Jag heter Anna Andersson.
        Mitt namn innehåller 14 tecken. */

        System.out.println("Hej! Jag heter "+  fullName); 
        System.out.println("Mitt namn innehåller "+ fullName.length() + " tecken");

        //Bonus

        String city = "Göteborg"; 
        String profession = "Mjukvarutestare";

        /*Använd variablerna för att skapa meningen:

        Anna Andersson bor i Göteborg och utbildar sig till Mjukvarutestare.
        */
         System.out.println(fullName + " bor i " + city + " och utbildar sig till " + profession); }
}