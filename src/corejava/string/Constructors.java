package corejava.string;

public class Constructors {
    public static void main(String[] args){

        //---> String Declaration

        String s1 = new String();

        //char String
        String s2 = new String("Hello");
//        System.out.println(s1);
//        System.out.println(s2);

        String s3 = "Prasad";
        String s4 = new String(s3); // s3 will store in String pool
                                    // s4 have in in normal heap memory and there is in String pool aslo

        //char array
        char[] arr = {'r','a','t','h','o','d' , ' ' , 'p' , 'r'};
        String s5 = new String(arr);
//        arr[0] = 'b';

        //char array subset
        String s6 = new String(arr,0 , 6);


        byte[] arr2 = {99,98,97};
        String s7 = new String(arr2);

        //StringBuilder / StringBuffer
        StringBuilder sb = new StringBuilder("hello");
        String sB = new String(sb);

        System.out.println(sb);
    }
}
