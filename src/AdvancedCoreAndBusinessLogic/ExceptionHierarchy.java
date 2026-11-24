package AdvancedCoreAndBusinessLogic;
//Exception Hierarchy Deep Dive

/*
nested try catch

try{

case : 1 --> inner try will be handled bu inner catch
   try{

   }
   catch{

   }

case : 2 --> if inner try dont have the catch then that try will go and check to outer try's catch handling that exception or not
   try{
   }
}
catch{

}

-->Avoid nested try catch

*** -- > Hierarchy of exceptional handling
     throwable --> java & exception
               -- throwable is the parent

      --> Exception :
                     give us important 3 methods
                     - getmessage(){}
                     - printStackTrace(){}
                     - toString() {}

            - Exception devide in 2 parts - RuntimeException & compiletime Exception
              RuntimeException:
                              - NullPointerException
                              - ArithmeticException
                              - IndexOutboundException
                              - IllegalArgumentException
                              - IllegalStackException
                              - ClassCostException




*/

import java.io.FileNotFoundException;
import java.io.FileReader;

class InvalidAgeException extends Exception{
    public InvalidAgeException (String message){
        super(message);
    }
}
public class ExceptionHierarchy {
    public void main(String[] args){

        //----> custom Exception



        //----> Throws --

//        try {
//            readFile();
//        }
//        catch (FileNotFoundException e){
//            System.out.println("File not found");
//        }



        //---->Throw

//        checkEligibility(20);

//        try {
//            checkEligibility(20);
//        }
//        catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }

}


//-----> throws
//private static void readFile() throws FileNotFoundException{
//        FileReader fr = new FileReader("abc.txt");
//
//}



//        private static void checkEligibility(int age){
//        try {
//            if(age <= 0){
//                throw new IllegalArgumentException("age is not be negative");
//            }
//            if(age>18){
//                System.out.println("Your are eligible to vote");
//            }
//        }
//        catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }
//}



//        try {
//            System.out.println(5/0);
//        }
//        catch (NullPointerException e){
//            System.out.println("Nulls are not allowed");
//        }
//        catch (ArithmeticException e){
//            System.out.println("Arithmetic Exception");
//        }
//        catch (RuntimeException e){
//            System.out.println(e.getMessage()); // by zero
//
//        }
//        catch (Throwable e){ // not recommendade
//            System.out.println("Catched by Throwable");
//        }
//
//        catch(Exception e){ //----->  parent of all time of exception
//            System.out.println("Exception");
//        }



        //----> Outer catch will handle inner exception
//        try {
//            System.out.println("outer try starts" );
//            try {
//                System.out.println("inner start");
//                System.out.println(5/0);
//                System.out.println("inner end");
//            }
//            catch (NullPointerException e){
//                System.out.println("inner exception");
//            }
//        }
//        catch(ArithmeticException E){
//            System.out.println("Outer Exception");
//        }
        /*
            outer try starts
            inner start
            Outer Exception
         */




        //----> Inner try handle it's own exception
//        try {
//            System.out.println("outer try starts" );
//            try {
//                System.out.println("inner start");
//                System.out.println(5/0);
//                System.out.println("inner end");
//            }
//            catch (ArithmeticException e){
//                System.out.println("inner exception");
//            }
//        }
//        catch(ArithmeticException E){
//            System.out.println("Outer Exception");
//        }
        /*
                outer try starts
               inner start
               inner exception
         */


}
