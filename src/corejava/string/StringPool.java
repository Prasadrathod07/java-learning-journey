package corejava.string;

public class StringPool {
    public static void main(String[] args){






        String s1 = "hello"; // literal
        String s2 = "hello";

//        System.out.println(s1 == s2);

        String s3 = new String("Radha"); // using new operator
        String s4 = new String("Radha");
        System.out.println(s3 == s4);

        //----> golden rule
        String s5 = "ja" + "va"; // resolve at compile time
        String s6 = "java" ; // s5 == s6 will be true --> because that store in string pool even that is coming at compile time

        String s7 = "ja";
        String s8 = s1 + "va";
        String s9 = "java";
//        System.out.println(s9 == s8);
        //this will be false - s7 is in String pool , s8 will be in normal heap memory and from s8 "ja" will store in String pool because that is literal ()
        // so at run time s8 got "java" but that is in normal heal memory.
        // and s9 is literal so that is going in String pool

        String s10 = "java"; // this is literal and going to store String pool
        String s11 = s10; // here we are just assiging - so this resolve at compile time and that s10 in String pool and that will be true
//        System.out.println(s10 == s11);

        String s12 = "Diwali"; // object created
        s12 = "happy"; // this is also literal so so this go into String pool and check is there this object present if not then create new object
                       // and now s12 is pointing to happy so previous connection with diwali will be killed by garbage later

        String s13 = new String("India");
        String s14 = "India";
        // in this case this object created in heap memory and also in String pool
        // in string pool created object is not pointed to anyone but that is there
        // and if in future we do something like : String s14 = "India"; - so this is literal and this go to String pool and check is there this object present or not is presend then that assigned

/*

        String s1 = "hello"; --- immutable
        s1.concat(("world"));

        System.out.println(s1);

        String declare- litral (String pool) , and new
    eg: String s = "Hello" -------> literal
        (in heap memory there created String pool place for storing s
        if i now create String s2 = "Hello" --> so in String pool there only one Hello
        will be there. becouse in literal we check is that object already present or not

        String s = new String ("Hello);
       - in this case heal memory create new object.

       == compare reference
       equal() compare values

*/
    }
}
