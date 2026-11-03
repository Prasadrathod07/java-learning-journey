package corejava.oops;
//here we are practicing constructor chaining , overloading and 'this

//class rules{
//    //rules of constructor
//    /*
//    - same name as class
//    - no return type , no even void
//    - automatically called during object creation
//    - used to initialize an object
//    - it can also to be overloaded
//    */
//}
//constructor is mandatory for java - if we not create that then that will create a default constructor

//parameterized constructor
/*
* class Student {
* String name;
* int age;
* Student (String n , int a){
* name = n ;
* int = a;
* }
* }
*
* Student s1 = new Student("rathod" , 25);
* */
//class student {
//    String name; // --> instance variable
//    int age;
//}

      //example 1

//class Student{
//    String name;
//    int age;
//    int rollNumber;
//    String collage;
//
//    void idCard(){
//        System.out.println(name + age + rollNumber + collage );
//    }
//    Student(String n , int a , int rn , String c){
//        name = n;
//        age = a;
//        rollNumber = rn;
//        collage = c;
//    }
//}


//using this , chaining in constructor
//class Student {
//    String name;
//    int age;
//}
////    Student(String name , int age){
////        this.name = name;
////        this.age = age;
////    }
//    Student(){
//        this("unknown" , 0);
//    }
//    Student(String name){
//        this(name , 0);
//    }
//    Student(String name , int age){
//        this(name , age);
//    }
//
//}


  //example 2
/*
Question: Hotel Room Setup

Scenario:
A hotel needs to create room records with their initial details.

Task:
Create a HotelRoom class with a parameterized constructor.

Requirements:
1. Add fields: roomNumber, roomType, and pricePerNight.
2. Create a constructor that accepts and initializes all three fields.
3. Use parameter names that match the field names.
4. Use "this" to distinguish fields from parameters.
5. Create a displayDetails() method.
6. In main, create two separate rooms with different details.
7. Do not assign field values directly from main after creation.
8. Display both rooms.

Expected Behaviour:
Room 101: Single, 1500 per night.
Room 202: Double, 2500 per night.
Each object must retain the values supplied to its constructor.
*/

//    class HotelRoom{
//        int roomNumber;
//        String roomType;
//        int pricePerNight;
//        void displayDetails(){
//            System.out.println("room" + roomNumber + " : "+ roomType +" , "+ pricePerNight);
//        }
//        HotelRoom(int roomNumber , String roomType , int pricePerNight){
//            this.roomNumber = roomNumber;
//            this.roomType = roomType;
//            this.pricePerNight = pricePerNight;
//        }
//}



    //example 3

    /*
Question: Training Course Registration

Scenario:
A training institute creates course records.
Some courses have a confirmed fee; others need a default fee.

Task:
Create a TrainingCourse class with overloaded constructors.

Requirements:
1. Add fields: courseName, durationInDays, and fee.
2. Create a constructor that accepts all three values.
3. Create another constructor that accepts only courseName
   and durationInDays, and sets fee to 3000.
4. Use "this" when assigning parameters to matching fields.
5. Create a displayDetails() method.
6. Create a calculateTotalFee(int studentCount) method
   that returns fee multiplied by studentCount.
7. In main, create one course using each constructor.
8. Display both courses and print their total fees for 5 students.
9. Do not assign field values directly from main after creation.

Expected Behaviour:
Java course: 15 days, supplied fee 5000.
Total fee for 5 students: 25000.

Communication Skills course: 7 days, default fee 3000.
Total fee for 5 students: 15000.

Self-check:
Can you create an object using an empty argument list
with only these two constructors defined? Explain why.
     */


    class TrainingCourse {
        String courseName;
        int durationInDays;
        int fee;

    TrainingCourse(String courseName , int durationInDays , int fee){
        this.courseName = courseName;
        this.durationInDays = durationInDays;
        this.fee = fee;
    }

    TrainingCourse(String courseName , int durationInDays){
    this.courseName = courseName;
    this.durationInDays = durationInDays;
    this.fee = 3000;
    }

    void displayDetails(){
        System.out.println(courseName + " | " + durationInDays + " days | fee : " + fee);
    }

    int calculateTotalFee(int studentCount){
        return studentCount * fee;
    }

}

public class constructorsAndThisKeyword {
    public static void main(String[] args) {

        //example 3
        TrainingCourse JavaCourse = new TrainingCourse("java" , 15 , 5000);
        TrainingCourse CommunicationCourse = new TrainingCourse("communication skills" , 7);

        JavaCourse.displayDetails();
        CommunicationCourse.displayDetails();



        //example 2
//        HotelRoom hotelroom1 = new HotelRoom(101,"single" , 1500);
//        HotelRoom hotelroom2 = new HotelRoom(202,"double" , 2500);
//
//hotelroom1.displayDetails();
//hotelroom2.displayDetails();



//        //example 1
//        Student s1 = new Student("prasad" , 25 , 62 ,"cocsit collage" );
//        System.out.println(s1.name);
//
//Student s1 = new Student("rathod" , 26);
//        System.out.println(s1.age);
//
//        int x = 2; // --> local variable , local variable no default value
//        student s1 = new student();
//        System.out.println(s1.name); // null -- default value
//        System.out.println(s1.age); //0


    }
}
