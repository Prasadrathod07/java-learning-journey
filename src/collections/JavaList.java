package collections;
import java.util.*;



//List - ArrayList , LinkedList

//The Java Collections Framework provides a set of interfaces (like List, Set, and Map)
//and a set of classes (ArrayList, HashSet, HashMap, etc.) that implement those interfaces.

/*
core interfaces and there common classes
-- List : ArrayList , LinkedList
-- Set  : HashSet , TreeSet , LinkedHashSet
-- Map  : HashMap ,TreeMap , LinkedHashMap


---->List Interface
     - represent an ordered collection of element
     - we can access element by there index , add duplicates and maintain the insertion order
     - use class to implement list interface like ArrayList  , LinkedList
     - ArrayList - like a resizable array with fast random access and LinkedList - like a train of cars we can easily attach or remove
     - some list methods
         add() ,
         get() ,
         set() ,
         remove() ,
         size()

*/
//---- > LinkeList - The LinkedList class has the same methods as ArrayList because both follow the List interface.
//                 - we can add , change , remove , clear the elements in LinkeList like ArrayList

//

               /*
               LinkedList methods :
                                   addFirst()
                                   addLast()
                                   removeFirst()
                                   removeLast()
                                   getFirst()
                                   getLast()
                */
/*
- ArrayList: It uses a regular array inside. When it gets full, Java creates
   a new array 1.5 times bigger and copies all the old items into it.
- LinkedList: It works like a chain of connected boxes (nodes).
  There is no pre-allocated space; a new box is created one by one
  and linked to the chain whenever you add an item.
 */


public class JavaList {
    public static void main(String[] args){
        // ----> LinkedList
//        LinkedList<String> subjets = new LinkedList<>();
//        subjets.add("Maths");
//        subjets.add("Science");
//        System.out.println(subjets);


//      ----> ArrayList
//sort an ArryaList
//        ArrayList<String> alphabets = new ArrayList<>();
//        alphabets.add("z");
//        alphabets.add("b");
//        alphabets.add("a");
//        alphabets.add("c");
//
//        Collections.sort(alphabets);
//        System.out.println(alphabets);
//        for(String i : alphabets){
//            System.out.println(i);
//        }



//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("mazda");
////        cars.remove(3); // removing the element which is on index 3
//        System.out.println(cars);
//        for(int i = 0; i< cars.size(); i++){
//            System.out.println(cars.get(i));
//        }


        // cars.clear(); // remove all the elements from the ArrayList

//        ArrayList<String> fruits = new ArrayList<>();
//        fruits.add("mango");
//        fruits.add("pineapple");
//        fruits.add("banana");
//        fruits.add("apple");
//        fruits.add("greps");
//        fruits.get(3); // getting the element which is at index 3
//        fruits.set(4, "tomato"); // set the new elemtn at index 4
//        System.out.println(fruits);
//        System.out.println(fruits.get(3));
//
//        ArrayList<Integer> years = new ArrayList<>();
//        years.add(2000);
//        years.add(2003);
//        years.add(0, 1996); //insert element at index 0
//        years.add(1, 1998);
//
//        years.size();
//        System.out.println(years);
    }
}
