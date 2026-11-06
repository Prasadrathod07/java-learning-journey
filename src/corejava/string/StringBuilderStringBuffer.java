package corejava.string;

public class StringBuilderStringBuffer {
    public static void main (String[] args){

        //new StringBuilder() // -- initial 16 size and if increase then that increate by (initial * 2) + 2 --> 16 , 34 , 70
        //new StringBuilder(50) // --> here is 50
        //methods in StringBuilder and StringBuffer is
        // append(), , insert() , delete() , replace() , reverse() , charAt() , setCharAt() , length() , capacity(),ensure capacity() , trimToSize()

        StringBuilder sb = new StringBuilder();
        sb.append("Prasad ");
//        sb.append("Rathod");
//        System.out.println(sb); //Prasad Rathod

        //insert()
//        sb.insert(7 , "_");
//        System.out.println(sb); //Prasad _Rathod

        //delete()
//        sb.delete(0 , 3);
//        System.out.println(sb); // sad _Rathod

        //replace()
//        sb.replace(0,4,"PPPPP");
//        System.out.println(sb);

        //reverse()
//        System.out.println(sb);
//
//        System.out.println(sb.length()); //7
//        System.out.println(sb.capacity()); // 16
//
//        System.out.println(sb.capacity());
//        sb.ensureCapacity(200);

    }
}
