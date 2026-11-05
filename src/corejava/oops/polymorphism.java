package corejava.oops;


//---------Polymorphism
//compile time (method overloading) , run-tim (method overriding)
// static : static method do not override - they belogs to class not to objects
// private : private also do not overriden
// final : final method cannot be overriden - we write final intentionally

// and field - variable they cannot be polymorphism , no participate in polymorphism
//we can override with methods


// is we use final to any class then we cannot create child class


//class A{
//    static void fun(){
//        System.out.println("hello");
//    }
//}
//class B{
//    static void fun(){
//        System.out.println("bye");
//    }
//}

//class Parent{
//    void print(){
//        System.out.println("parent class");
//    }
//}
//
//class Subclass1 extends Parent{
//    void print(){
//        System.out.println("subclass 1");
//    }
//}
//
//class Subclass2 extends Parent{
//    void print(){
//        System.out.println("subclass 2");
//    }
//}


class Payment{
    void pay(int amount){
        System.out.println("Processing Amount of " + amount);
    }
}

class UpiPayment extends Payment{
    @Override
    void pay(int amount){
        System.out.println("Paid " + amount + " using UPI" );
    }
}
class CardPayment extends Payment{
    @Override
    void pay(int amount){
        System.out.println("Paid " + amount + " using Card");
    }
}

public class polymorphism {
    public static void main(String[] args){

        Payment p = new CardPayment();
        p.pay(500);

        p = new UpiPayment();
        p.pay(600);


//        Parent a;
//        a = new Subclass1();
//        a.print();
//
//        a = new Subclass2();
//        a.print();
    }
}

