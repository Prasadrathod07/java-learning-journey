package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionInterface {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);

        //size
//        int n = c.size();
//        System.out.println(n);

        //isEmpty
//        System.out.println(c.isEmpty());

        //boolean contains(object o)
//        System.out.println(c.contains(2));

        //iterate()

        //toArray
//        Object[] obj = c.toArray();
//        for(Object o : obj){
//            System.out.println(o);
//        }

        //boolean add(E e)
//        boolean b = c.add(4);
//        System.out.println(b);

        //boolean remove(Object obj)
//        System.out.println(c.remove(2));
//        System.out.println(c.remove(4));

        //boolean addAll(Collection <? extends E> c)
//        c.addAll(List.of(4,5,6,7,8,9,10));
//        System.out.println(c);

        //boolean containsAll
//        System.out.println(c.containsAll(List.of(1,2,3)));


        //boolean removeAll

        //retainAll
//        c.retainAll(List.of(1,2));
//        System.out.println(c);


        //clear
//        c.clear();
//        System.out.println(c);
    }
}
