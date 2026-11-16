package collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.*;

//Iterable interface

/*
hasNext() - check is there next element present or not
next()

Iterator is a interface who have hasNext() and next()

- The iterator() method can be used to get an Iterator for any collection
 */

public class IterableInterface {
    public static void main(String[] args){


//removing items from collection
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(5);
        numbers.add(1);

//        Iterator<Integer> it = numbers.iterator();
//        while(it.hasNext()){
//            Integer i = it.next();
//            if(i<10){
//                it.remove();
//            }
//            System.out.println("checking it : "+it);
//            System.out.println(" numbers : "+numbers);
//        }
//
//        Iterator<Integer> it = numbers.iterator();
//        while(it.hasNext()){
////            Integer i = it.next();
//            if(it.next() <10 ){
//                it.remove();
//            }
//            System.out.println(numbers);
//        }





//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//
//        Iterator<Integer> it = list.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//
//
//        Collection<Integer> roll = new HashSet<>();
//        roll.add(62);
//        roll.add(61);
//        roll.add(12);
//
//        Iterator<Integer> It = roll.iterator();
//        while(It.hasNext()){
//            System.out.println(It.next());
//        }


        //make a collection
//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("BMW");
//        cars.add("Ford");
//
//        //get the iterator
//        Iterator<String> it = cars.iterator();
//
//        //print the first item
////        System.out.println(it.next());
//
//        //throw loop
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }


    }
}
