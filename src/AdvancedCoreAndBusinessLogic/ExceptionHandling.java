package AdvancedCoreAndBusinessLogic;

//Exceptions vs Errors
/*
   Exception - is the state of recoverable/ handleable abnormal condition that occurs during program execution
   Error - no recoverable --> out of memory error , stack overflow error
                          -->

  stack trace -->

        int a = 12;
        int b = 0;
        int num = a/b;
    """Exception in thread "main" java.lang.ArithmeticException: / by zero
	   at AdvancedCoreAndBusinessLogic.ExceptionHandling.main(ExceptionHandling.java:19)"
       --> exception in main thread - Exception in thread "main
       --> exception name : java.lang - import by default
       --> object : ArithmeticException
       --> you are trying to do this : / by zero
       --> where : at AdvancedCoreAndBusinessLogic.ExceptionHandling.main --> className.methodName
       --> filename and line number : ExceptionHandling.java:19



        int a = 12;
        int b = 0;
        methodA(a,b);

    }
    private static void methodA(int a , int b){
        methodB(a, b);
    }

    private static void methodB(int a, int b){
        System.out.println(a/b);
    }
   """Exception in thread "main" java.lang.ArithmeticException: / by zero
	at AdvancedCoreAndBusinessLogic.ExceptionHandling.methodB(ExceptionHandling.java:44)
	at AdvancedCoreAndBusinessLogic.ExceptionHandling.methodA(ExceptionHandling.java:40)
	at AdvancedCoreAndBusinessLogic.ExceptionHandling.main(ExceptionHandling.java:31)"""

	---> first methodB show the exception and then that method be checked is methodA handle the exceptions
	     and then if methodA also not handled the exceptions then that check main method



   //Goad --> then an exception occurs , don't crash. handle it & continue

          try{
              // try we use where we think this code is risky and jya code madhe exceptions yeu shakt
                   eg: int a = 12;
                       int b = 0;
                       methodA(a,b);
          }
          catch{
               // if there is exception
               //preventive code - jar code fatla tr kay preventive aaplyala karaychet

          }
*/

public class ExceptionHandling {
    public void main(String[] args) {


//        //Exception handling
//        methodA(a,b);
        System.out.println("Step 1");
        try {
            int a = 12;
            int b = 0; // Devision by zero is not allowed
//            int b = 3; // 4
            System.out.println(a / b); // illegal code --> inside ArthemeticException tayyar karel ani check karel kon handle kartoy ka ya exception la
            // first baghel tyach method madhe and tyala ArithimaticException catch and tyala kalun jat ki as exgineer mi exception handle keloy te code pude jato
        } catch (ArithmeticException e) {  // if there is ArithhmeticException is not there and there if NullPointerException then this catch will not work - we can write multi catch also
            System.out.println("Devision by zero is not allowed");
           // e.getStackTrace();
           // e.printStackTrace(); // for log record we can get this
        }
//        finally {
//            // this always runs
//            // clearup code (optional) -
//            System.out.println("heyy");
//        }
        System.out.println("Step 2");

    }
}


//        System.out.println("Step 1");
//        int num = a/b;
//        System.out.println(num); //Arithmetic Exception
//        System.out.println("Step 2"); //---> this not printing because this is terminated because previously there is an exception
//

//    private static void methodA(int a , int b){
//        methodB(a, b);
//    }
//
//    private static void methodB(int a, int b){
//        System.out.println(a/b);
//    }

