package collections;
import java.util.*;
//algorithms are used to solve problems by sorting , searching and manipulating data structure
// there are many algorithms already build into collection class


//----> Searching
/*
- to finding element in a list java provides helpers methods
  eg : Collections.binarySearch() - which search in a sorted list
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class JavaAlgorithms {
    public static void main(String[] args){



//Iterating - looping through elements
//        ArrayList<String> colors = new ArrayList<>();
//        colors.add("Red");
//        colors.add("green");
//        colors.add("yellow");

//        for(String c : colors){
//            System.out.println(c);
//        }


//sort reverse order
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(10);
        numbers2.add(5);
        numbers2.add(100);
        numbers2.add(1);

        Collections.sort(numbers2,Collections.reverseOrder());
        System.out.println(numbers2);


//        Collections.sort(numbers2,Collections.reverseOrder());
//        Collections.sort(numbers2,Collections.reverseOrder());
//        Collections.sort(numbers2, Collections.reverseOrder());


//----> sorting
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(100);
        numbers.add(1);
        numbers.add(1);

//        System.out.println(numbers);
//        Collections.sort(numbers);
//        System.out.println(numbers);


//usefull algorithms
        System.out.println("max " + Collections.max(numbers));
        System.out.println("min " + Collections.min(numbers));
        System.out.println("Frequency " + Collections.frequency(numbers , 1));

//----> Searching
        ArrayList<String> names = new ArrayList<>();
        names.add("Prasad");
        names.add("Adarsh");
        names.add("vaibhav");

        Collections.sort(names); // so Adarsh will come first - for that sorting
        int index = Collections.binarySearch(names , "Adarsh");
        System.out.println("Adarsh at index : " + index);

    }
}
