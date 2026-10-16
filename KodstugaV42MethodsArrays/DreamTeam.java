package KodstugaV42MethodsArrays;

public class DreamTeam {

    public static void main(String[] args) {
        String[] spelarnames ={"Johan", "Bob", "Mario","Pinki","Daisy"};
        System.out.println("Övning 3 Ditt drömlag");
        System.out.println("First element in the array is: " + spelarnames[0]);
        System.out.println("Last element in the array is: " + spelarnames[spelarnames.length-1]);

        spelarnames[4]="Colin";
        System.out.println("Players in the dream team are: " );
        for(int i=0; i <spelarnames.length; i++)
        {
        
            System.out.println(spelarnames[i]);
           
        }

        System.out.println("Number of players in the team" + spelarnames.length);
        System.out.println("Players in the dream team are: " );
        for(String namn : spelarnames)
        {
            System.out.println(namn);
        }

    }

    

    
    
}
