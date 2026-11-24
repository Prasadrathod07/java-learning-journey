package collections;
import java.util.*;

//use to store key value pairs - each key must be unique but values can be duplicate
//Map is usefull when we want to associate key with values like name , ID

/*
comman classes that implement Map
- HashMap (fast and unordered)
- TreeMap (sorted by key)
- LinkeHashMap (ordered by insertion)


methods of Map
- get() --> return the value of given key
- put() --> add and update
- remove() --> remove the key and its value
- containsKey() -->check if the map contains the key
- keySet() -- return a set of all keys

----->HashMap
- HashMap store items in key and values pair
- can store many combinations like String key and Integer values and String key and String values
- unsorted order
syntax :
       HashMap<String , String> capitalCities = new HashMap<>();


-----> TreeMap
- TreeMap stores key/value pairs in sorted order by key
- TreeMap<String,String> capitalCities = new TreeMap<>();

-----> LinkedHashMap
-  store key and values and keeps them in the same order we put them in
- insertion order

 */

public class JavaMap {
    public static void main(String[] args) {

//-----> LinkedHashMap
//        LinkedHashMap<String , String> stateCapitals = new LinkedHashMap<>();
//        stateCapitals.put("Maharastra", "Mumbai");
//        stateCapitals.put("karnataka" , "benguluru");
//        stateCapitals.put("Gujarat" , "Gandhi Nagar");
//        stateCapitals.put("Rajasthan" , "Jaipur");
//        System.out.println(stateCapitals);
//
//        for(String i : stateCapitals.keySet()){
//            System.out.println(i);
//        }


//-----> TreeMap
//        TreeMap<String, String> stateCapitals = new TreeMap<>();
//        stateCapitals.put("Maharastra", "Mumbai");
//        stateCapitals.put("karnataka" , "benguluru");
//        stateCapitals.put("Gujarat" , "Gandhi Nagar");
//        stateCapitals.put("Rajasthan" , "Jaipur");
//
//        System.out.println(stateCapitals);
//        System.out.println(stateCapitals.size());
//
//        for(String i : stateCapitals.values()){
//            System.out.println(i);
//        }

//        TreeMap<String , Integer> subjectsMarks = new TreeMap<>();
//        subjectsMarks.put("Maths" , 98);
//        subjectsMarks.put("Science" , 62);
//        System.out.println(subjectsMarks);
//
//        for(String i :subjectsMarks.keySet()){
//            System.out.println(i);
//        }
//        for(Integer o : subjectsMarks.values()){
//            System.out.println(o);
//        }

//----->HashMap
        //creating HashMap object
//        HashMap<String, String> capitalCities = new HashMap<>();

        //Add keys and values(country , city)
//        capitalCities.put("India", "Delhi");
//        capitalCities.put("England", "London");
//        capitalCities.put("USA", "Washington DC");
//        capitalCities.put("Austria", "Wien");

//        System.out.println(capitalCities);
//        System.out.println(capitalCities.remove("Austria"));
//        System.out.println(capitalCities);
//        System.out.println(capitalCities.get("India")); // to access the value of key India
//
//        capitalCities.size();

        //using loop
//        for (String i : capitalCities.keySet()){
//            System.out.println(i);

//
//        for (String o : capitalCities.values()) {
//            System.out.println(o);
//        }

//    }
        HashMap<String ,String> capitalCities = new HashMap<>();
        capitalCities.put("India","Delhi");
        capitalCities.put("England","London");

        HashMap copy = (HashMap) capitalCities.clone();
    // copy the capitalCities
//        System.out.println(copy);

//        System.out.println(copy.containsKey("India"));
        System.out.println(capitalCities.entrySet()); //entrySet() contains all of the entries in the map

        System.out.println(capitalCities.size());
    }
}
