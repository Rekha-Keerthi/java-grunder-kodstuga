package CollectionsOvning;

import java.util.HashMap;
import java.util.Map;

public class mapOvning {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        //add key-value pair to the map
        map.put("Rekha", 111);
        map.put("John", 222);
        map.put("Ron",  333);

        //get vlaue based on key
        System.out.println("kay of  Rekha: " + map.get("Rekha"));

        //remove the value
        map.remove("Jhon");
        System.out.println("Map after removing :" + map);

        //return all the key as a set
        System.out.println("All keys in the map " + map.keySet());

        //return all the values in the form of set
        System.out.println("Values in the map "+ map.values());


    }
    
}
