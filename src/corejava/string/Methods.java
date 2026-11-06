package corejava.string;

import java.nio.charset.StandardCharsets;

public class Methods {
    public static void main(String[] args){

//intern() , formate()
//        String s1 = new String("Radharadha"); // normal heap memory + String pool
////        String s2 = s1; // Both variables s1 and s2 now point to the exact same object in the heap memory
//        String s2 = s1.intern();
//        System.out.println(s1 == s2);


        //formate
        String name = "Prasad";
        int age = 25;
        System.out.println(String.format("hello %s your age is %s", name , age));


//conversion
//        String s4 = new String(String.valueOf(10));
//        String s5 = new String(String.valueOf(true));
//        String s6 = new String(String.valueOf(309));
//        String s1 = new String("Radharadha");
//        byte[] arr = s1.getBytes();
//                                   //System.out.println(arr);
//        for(byte b : arr){
//            System.out.println(b);
//        } //ASCII value



//extraction / transformation
//        String s1 = new String("Radharadha  ");
//        System.out.println(s1.substring(5 , 7)); //ra
//        System.out.println(s1.substring(5)); //radha
//        System.out.println(s1.toUpperCase());
//        System.out.println(s1.toLowerCase());
//        System.out.println(s1.trim());
//        System.out.println(s1.repeat(2)); //Radharadha  Radharadha
//        System.out.println(s1.replace('a' , '@')); // R@dh@r@dh@

//        String s2 = "Radha , sham , krishna";
//        String [] arr = s2.split(",");
//        for(String s : arr){
//            System.out.println(s);
//        }

//        System.out.println(String.join("-", "a","b")); // a-b





//searching
//        String s1 = new String("Radha");
//        System.out.println(s1.contains("dh")); //true
//        System.out.println(s1.indexOf("dh")); //2
//        System.out.println(s1.lastIndexOf("ha")); //3


//comparison
//        String s1 = new String("Radha");
//        String s2 = new String("Radha");
//        String s3 = new String("RADHA");
//        System.out.println(s1.equals(s2)); //true
//        System.out.println(s1.equals(s3)); //false
//        System.out.println(s1 == s2); //false
//        System.out.println(s1.equalsIgnoreCase(s3)); //true


//lexicographical comparison
//        String s1 = new String("abc");
//        String s2 = new String("abd");
//        System.out.println(s1.compareTo(s2)); //-1


// character access
//        String s3 = new String("PrasadRathod");
//        System.out.println(s3.charAt(8));

//        char[] arr = s3.toCharArray();
//        System.out.println(arr);


//length / emptiness
//        String s1 = new String("Prasad");

//        System.out.println(s1.length()); //6
//        System.out.println(s1.isEmpty()); // false
//        System.out.println(s1.isBlank()); //false

//        String s2 = new String("     ");
//        System.out.println(s2.length()); //6
//        System.out.println(s2.isEmpty()); // false
//        System.out.println(s2.isBlank()); //true


        // == operator is used fo reference comparison it means == operator check if both objects point to the same memory location or not
        // .equals is used for content comparison in String class - it means .equals() method is used to check object value.
//        String s1 = new String("Prasad");
//        String s2 = new String ("Prasad");
//        System.out.println(s1 == s2); //false
//
//        String s3 = "Rathod";
//        String s4 = "Rathod";
//        System.out.println(s3 == s4); //true




    }
}
