package corejava.oops;

//code reusability
//support polymorphism

//simple inheritance ----------->  example 1
//class Student{
//    String name;
//    int age;
//
//    void markAttendance(){
//        System.out.println("Attendance marks");
//    }
//}
//
//class EngineeringStudence extends Student{
//
//    void attendLab(){
//        System.out.println("Lab attended");
//    }
//}


//multi level inheritance
// class A parent of class B and class B parent of class c : A --> B --> C
//class Student{
//    String name;
//    int age;
//
//    void markAttendance(){
//        System.out.println("Attendance marks");
//    }
//}
//
//class EngineeringStudence extends Student {
//
//    void attendLab() {
//        System.out.println("Lab attended");
//    }
//}
//class CSEngineeringStudent extends EngineeringStudence{
//        void attendlab(){
//            System.out.println("Attempt");
//        }
//    }


//Hierrarchy
/*     A
     /   \
    B     C
 if Student is A class and Engineering Student is B class and we can create C class and B and C can extends class A
*/


//super
//class Student{
//    String name;
//    int age;
//    int rollNumber;
//}
//class EngineeringStudent extends Student{
//    String collage;

/// /    super.age;  --->  error - because we must tell java what to do with it once it fetches it
//    String nameReturn(){
//        System.out.println(super.age);
//        return super.name;
//    }
//    void print(){
//        System.out.println(super.name + super.age + super.rollNumber + collage);
//
//    }
//}


// --------------> Example 2
/*
Create a program demonstrating single inheritance.

Requirements:
1. Create a parent class Person with private fields name and age.
2. Initialise them through a constructor and provide getters.
3. Add a displayDetails() method to print the person’s name and age.
4. Create a child class Student that extends Person.
5. Add a private field studentId to Student.
6. Use super(...) in the student constructor to initialise the parent fields.
7. Add displayStudentDetails() to display the student ID along with the inherited person details.
8. In main(), create two students and display their details.
Self-check: Can Student directly access the private name field? How can it read the name?
 */

//class Person {
//    private String name;
//    private int age;
//
//    Person(String name , int age){
//        this.name = name;
//        this.age = age;
//    }
//    Person(){}
//
//    public String getName(){
//        System.out.println(name);
//        return name;
//    }
//    public int getAge(){
//        System.out.println(age);
//        return age;
//    }
//
//    void displayDetails(){
//        System.out.println("Student name is " + name + " and " + age + " year old.");
//    }
//}
//
//class Student extends Person{
//    private int studentId;
//    Student(String name,int age , int studentId){
//        super(name , age);
//        this.studentId = studentId;
//    }
//    public void displayStudentDetails(){
//        super.displayDetails();
//        System.out.println(super.getName() + super.getAge() + studentId);
//    }
//}


//--------example 3
/*
Create a program demonstrating inheritance and method overriding.

Requirements:
1. Create a parent class Employee with private fields name and basicSalary.
2. Initialise them using a constructor and provide getters.
3. Add calculateSalary() that returns the basic salary.
4. Create two child classes: Developer and Manager.
5. Add a private bonus field to Developer and a private allowance field to Manager.
6. Use super(...) in both child constructors.
7. Override calculateSalary() using @Override:
   - Developer: basic salary plus bonus.
   - Manager: basic salary plus allowance.
8. Use super.calculateSalary() inside each overridden method.
9. In main(), create one developer and one manager. Display their names and calculated salaries.
10. Call the overridden methods through variables whose declared type is Employee.
 */

class Employee {
    private String name;
    private int basicSalary;

    Employee(String name, int basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }
    Employee(){}

    public String getName() {
        System.out.println(name);
       return name;
    }

    public int getBasicSalary() {
        System.out.println(basicSalary);
        return basicSalary;
    }

    public int calculateSalary(){
        System.out.println(basicSalary);
        return basicSalary;
    }
}

class Developer extends Employee {
    private int bonus;
    public Developer(String name , int basicSalary , int bonus){
        super(name , basicSalary);
        this.bonus = bonus;
    }
    @Override
    public int calculateSalary(){
        return super.calculateSalary() + bonus;
    }
}
class Manager extends Employee{
    private int allowance;
    public Manager(String name , int basicSalary , int allowance){
        super(name , basicSalary);
        this.allowance = allowance;
    }
    @Override
    public int calculateSalary(){
        return super.calculateSalary() + allowance;
    }

}

//-------Example 4
class Vehicle{
    private int registrationNumber;
    private int dailyRate;

    Vehicle(int registrationNumber , int dailyRate){
        this.registrationNumber = registrationNumber;
        this.dailyRate = dailyRate;
    }
//    Vehicle(){}
    public int getRegistrationNumber(){
        return registrationNumber;
    }
    public int getDailyRate(){
        return dailyRate;
    }


    public int calculateRent(int days){
        return days * dailyRate;
    }
}
class Car extends Vehicle {
    private int insuranceFee;
    Car(int registrationNumber , int dailyRate , int insuranceFee ){
        super(registrationNumber , dailyRate);
        this.insuranceFee = insuranceFee;
    }

    @Override
    public int calculateRent(int days){
        return super.calculateRent(days) + insuranceFee;
    }
}



public class inheritance {
    public static void main(String[] args) {

        //example 4
        Car car1 = new Car(4400,1000 , 500);
//        Car car2 = new Car (0044 , 500 , 750);
        System.out.println(car1.calculateRent(2));


        //example 3
        Manager manager = new Manager("Prasad" , 125000 , 50000);
        Developer developer = new Developer("Rathod" , 250000 , 50000);

//        System.out.println(manager.calculateSalary());
//        System.out.println(developer.calculateSalary());

        System.out.println("Manager: " + manager.getName());
        System.out.println("Total Paid: " + manager.calculateSalary());

        System.out.println("-----------------------------------");

        System.out.println("Developer: " + developer.getName());
        System.out.println("Total Paid: " + developer.calculateSalary());



        //example 2
//        Student student1 = new Student ("Prasad" , 25 , 10101 );
//        Student student2 = new Student ("Rathod" , 26 , 20012);
//
//        student1.displayStudentDetails();
//        System.out.println();
//        student2.displayStudentDetails();
//


//super
//EngineeringStudent s1 = new EngineeringStudent();
//s1.name = "Prasad";
//s1.print();

//multi lavel inheritance
//        CSEngineeringStudent s1 = new CSEngineeringStudent();

//simple inheritance ---->  example 1
//        EngineeringStudence s1 = new EngineeringStudence();
//        s1.attendLab();
//        s1.markAttendance();
    }
}
