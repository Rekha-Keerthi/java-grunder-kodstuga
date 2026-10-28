package CollectionsOvning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Listovning {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Ibbani");
        names.add("Rekha");
        names.add("Johan");
        names.add("xaveri");
        System.out.println(names.get(2));
        
        //sort an list
        Collections.sort(names);
        System.out.println("Sorted list : " + names);
        //binarySearch an element in a list
        System.out.println("returns index of an element " + Collections.binarySearch(names, "Rekha"));

        //swaping two elements in the list
        Collections.swap(names, 0, 2);
        System.out.println("Swapped list : " + names);

        //shuffle a list. shuffles the order of the list
        Collections.shuffle(names);
        System.out.println("Shuffled list : " + names);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(2);
        numbers.add(7);
        numbers.add(13);

        System.out.println("List before sortin : " + numbers);
        Collections.sort(numbers);
        System.out.println("List after sorting : " + numbers);
        

        List<String> nameslist2 = new ArrayList<String>();
        nameslist2.add("IIII");
        nameslist2.add("BBBB");
        nameslist2.add("CCCC");
        nameslist2.add("DDDD");
       


        Collections.copy(nameslist2,names);
       
        System.out.println(names);

        
    }
    
}
