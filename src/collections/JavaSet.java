package collections;
import java.util.*;
//Set - HashSet , TreeSet , LinkedHashSet
//The Java Collections Framework provides a set of interfaces (like List, Set, and Map)
//and a set of classes (ArrayList, HashSet, HashMap, etc.) that implement those interfaces.


//----> Set
/*
classes that implement set:
                           HashSet - fast and unordered
                           TreeSet - sorted set
                           LinkedHashSet - ordered by insertion
( we use Set when you need to store unique values only - no duplicates  )
// common Set Methods
  - add() --> adds an element if it's not already in the set
  - remove() --> remove the element form teh set
  - contains() --> checks if the set contains the element
  - size() --> return the number of elements
  - clear() --> remove all elements

--> not allow duplicates in set
--> no index based access
--> does not guarantee order (in list maintain order)



hashMap Internals
collision

--> 




------> HashSet
 - HashSet is the collection of element where every element is unique
 - no order to element
 - allow one null
 - If we add "Banana", "Apple", and "Mango" -- HashSet output: [Apple, Mango, Banana] (unpredictable order)

------> TreeSet
 - TreeSet is the collection that store unique element in sorted order
 - slower that HashSet because this took time to sort the element
 - no null allowed
 - If we add "Banana", "Apple", and "Mango" --  TreeSet output: [Apple, Banana, Mango] (alphabetical order)

-----> LinkedHashSet
 - LinkedHashSet is a collection that stores unique elements and remember
   the order they were added
 - allow one null
 - Keeps the exact order you added items
 - If we add "Banana", "Apple", and "Mango" -- LinkedHashSet output: [Banana, Apple, Mango] (exact order you added them)
 */
public class JavaSet {
    public static void main(String[] args){
        //-----> LinkedHashSet
//        LinkedHashSet<String> cars = new LinkedHashSet<>();
//        cars.add("z");
//        cars.add("b");
//        cars.add("f");
//        System.out.println(cars);


//------> TreeSet
//        TreeSet <String> cars = new TreeSet<>();
//        cars.add("z");
//        cars.add("b");
//        cars.add("f");
//        System.out.println(cars);


//------> HashSet
//        HashSet<String> cars = new HashSet<>();
//        //now we can use methods like add() , remove() etc,.
//        cars.add("volvo");
//        cars.add("BMW");
//        cars.add("ford");
//        cars.add("BMW"); //duplicate - this is never going to print because duplicates elements not allow in set
//        cars.add("abc");
//        System.out.println(cars); //[abc, ford, BMW, volvo]
//        System.out.println(cars.contains("abc")); //true
//        cars.remove("abc"); //removed abc from set
//        System.out.println(cars.size()); //3
//
//        // loop through a HashSet
//        for(String i : cars){
//            System.out.println(i);
//        }
//
//        //Hashset for Integer objects
//        HashSet<Integer> numbers = new HashSet<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(4);
//        numbers.add(6);
//        numbers.add(8);
//        numbers.add(10);
//        for(int i = 1; i<=10; i++){
//            if(numbers.contains(i)){
//                System.out.println(i + "was dound in the set");
//            }else{
//                System.out.println(i + "not found in the set");
//            }
//        }



    }
}
