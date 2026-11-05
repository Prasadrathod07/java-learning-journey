package corejava.oops;

//abstraction - low level abstraction , high level abstraction

// ----> low level abstraction

/*class car{ ----> concrete class
    String type;

    void start(){
        System.out.println("start");
    }
    void brake(){
        System.out.println("brake");
    }
}

is this we want to use in main then we do something like
car c = new car;
c.start(); ----> and we expect car have to start
                at background we dont know how that car going to start
                this is called low level abstraction *\


 */
// ----> High level abstraction

//abstract classes , interfaces


// ----------------Interface
/*
interface Car {
void start();
void stop();
void accelerate();
}

class fuelCar implement car{
    oid accelerate(){
        System.out.println("fuel car is accelerating");
    }
    void brake(){
        System.out.println("fuel car is stoping");
    }
}
- when we using interface then we have to use "implement" in another class
  where we are trying to inheritance / extracts from parent

 in object
 Car c = new _____ ----> fuelCar or electric car


 --why interface ?
 pure what - car declare karel ki kay kay ti karu shakte ani
            ani ti fuel car and electric car var sodun deil ki
            tyana tyanchya car madhe te ks use karaychay 'how'
- jo koni use karel tyala tya method implement karavyach lagtil
- define responsibility/role of that class
- name should be end with able like walkable . flyable , runable , camparable - here is the rule which defined

- but in new java we can defind interface like normal methods
    void brake(){
        System.out.println("fuel car is stoping");
    }

 */


// -------------> abstraction example 1 -----
/*
abstract class Carf{
    void start(){
        System.out.println("Started");
    }
    abstract void accelerate();
    abstract void brake();
}

class fuelCar extends Carf{
    @Override
    void accelerate(){
        System.out.println("fuel car is accelerating");
    }
    void brake(){
        System.out.println("fuel car is stoping");
    }
}

class electricCar extends Carf{
    @Override
    void accelerate(){
        System.out.println("electric car is accelerating");
    }

    void brake(){
        System.out.println("electric car is stopping");
    }
}
*/


//--------- interface Example 2 ---
//interface Carf {
//    void accelerate();
//    void brake();
//    void start();
//}
//
//class fuelCar implements Carf{
//    @Override
//    public void accelerate(){
//        System.out.println("fuel car is accelerating");
//    }
//    public void brake(){
//        System.out.println("fuel car is stoping");
//    }
//    public void start(){
//        System.out.println("started");
//    }
//}
//
//class electricCar implements Carf{
//    @Override
//    public void accelerate(){
//        System.out.println("electric car is accelerating");
//    }
//
//    public void brake(){
//        System.out.println("electric car is stopping");
//    }
//    public void start(){
//        System.out.println("started");
//    }
//}


/*
-----------Example 3
Create an abstract class Appliance with an abstract method turnOn(). Create Fan and
Light classes that extend Appliance and implement turnOn(). In main(), create one
object of each class and call its method.
Expected: The fan prints Fan is spinning, and the light prints Light is glowing.
 */

//abstract class Appliance{
//    abstract void turnOn();
//}
//class fan extends Appliance{
//    public void turnOn(){
//        System.out.println("Fan is spinning");
//    }
//}
//class light extends Appliance{
//    public void turnOn(){
//        System.out.println("Light is Glowing");
//    }
//}



/*
--------Example 4
Course Certificate — Abstract and concrete methods
Create an abstract class Course with a private field courseName and
a constructor. Add a concrete method displayCourseName() and an
abstract method isEligible(int score) that returns a boolean.
Create JavaCourse and DesignCourse subclasses. A Java student needs
at least 60 marks, while a Design student needs at least 70. Use super(...) in both constructors.
Expected: At 65 marks, JavaCourse returns true and DesignCourse returns
 false. Display each course name using the inherited method.
 */
abstract class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void displayCourseName() {
        System.out.println(courseName);
    }

    public abstract boolean isEligible(int score);
}

class JavaCourse extends Course {
    public JavaCourse() {
        super("Java Course");
    }

    @Override
    public boolean isEligible(int score) {
        return score >= 60;
    }
}

class DesignCourse extends Course {
    public DesignCourse() {
        super("Design Course");
    }

    @Override
    public boolean isEligible(int score) {
        return score >= 70;
    }
}



/*
----------> example 5
Create a Notification interface with a send(String message) method.
Implement it in EmailNotification and SmsNotification. In main(),
send the message Class starts at 10 AM through both objects.
Expected: Each object prints the same message with its own Email or SMS label.
 */

interface Notification {
    void send(String message);
}

class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}

class SmsNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}



public class Abstraction {
    public static void main(String[] args){

//----> example 5
        String message = "Class starts at 10 AM";

        Notification email = new EmailNotification();
        Notification sms = new SmsNotification();

        email.send(message);
        sms.send(message);

 //----> example 4
        JavaCourse javaCourse = new JavaCourse();
        DesignCourse designCourse = new DesignCourse();
        int score = 65;

        javaCourse.displayCourseName();
        System.out.println("Eligible: " + javaCourse.isEligible(score));

        designCourse.displayCourseName();
        System.out.println("Eligible: " + designCourse.isEligible(score));


//----> example 3
//        Appliance appliance = new light();
//        appliance.turnOn();
//        appliance = new fan();
//        appliance.turnOn();


//----> interface example 2
//        Carf car = new fuelCar();
//        car.start();


//----> abstraction example 1
//        Carf car = new electricCar();
//        car.start();
//        car.accelerate();
//        car.brake();
//
//        car = new fuelCar();
//        car.accelerate();

    }
}
