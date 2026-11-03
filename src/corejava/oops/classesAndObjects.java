package corejava.oops;

//classes, object , field and methods learning and practicing - Using AI for creating questions not for answers

                           //example 1
//class Students {
//    //following are fields
//    String name;
//    int age;
//    int rollNumber;
//    String collage;
//
//    //following are method - behavior
//    void markAttendence(){
//        System.out.println("Attendance marked by " + name);
//    }
//
//    void print()
//    {
//        System.out.println(name + "," + age + "," + rollNumber + "," + collage);
//    }}
//
//



           //example 2
/*
Question 1 — Employee Profile

Scenario:
A company needs to display information about two employees.

Task:
Create an Employee class.

Requirements:
1. Add fields: id, name, and department.
2. Create a displayDetails() method that prints the employee's details.
3. Create two separate Employee objects in the main method.
4. Assign different details to each object.
5. Call displayDetails() on both objects.

Expected Behaviour:
Each object must display its own employee details.
*/

//class employee {
//    int id;
//    String name;
//    String department;
//
//    void displayDetails(){
//        System.out.println(name + " your id is " + id + " and department is " + department  );
//    }
//}



     //example 3
/*
Question —  Product Price Calculator

Scenario:
A shop needs to calculate the total price for a given quantity of a product.

Task:
Create a Product class.

Requirements:
1. Add fields: name and unitPrice.
2. Create a displayProduct() method that prints the product details.
3. Create a calculateTotal(int quantity) method that returns the total price.
4. Create two separate Product objects in the main method.
5. Calculate and print the total price for 3 units of the first product
   and 5 units of the second product.

Expected Behaviour:
If unitPrice is 200, calculateTotal(3) must return 600.
Calculating the total must not change unitPrice.
*/

class product {
    String name;
    int unitPrice;
//    int unit;

    void displayProduct() {
        System.out.println("Price of a " + name + " is " + unitPrice + " rs");
    }

//    int calculateTotal() {
//        int quantity = unitPrice * unit;
//        System.out.println("total price is " + quantity);
//        return quantity;
//    }

    int calculateTotal(int quantity) {
        return unitPrice * quantity;
    }

}



public class classesAndObjects {
    public static void main(String[] args) {
        //example 3
        product product1 = new product();
        product1.name = "pen";
        product1.unitPrice = 5;
//        product1.unit=3;

        product product2 = new product();
        product2.name = "notebook";
        product2.unitPrice = 45;
//        product2.unit = 5;


        product1.displayProduct();
        product2.displayProduct();

        int totalPen = product1.calculateTotal(3);
        int totalNotbook = product2.calculateTotal(5);
        System.out.println("total price for 3 pens is : " + totalPen + " rs");
        System.out.println("total price for 5 notebook is : " + totalNotbook + " rs");


//        //example 2
//        employee employee1 = new employee();
//        employee1.id = 1010;
//        employee1.name = "Prasad";
//        employee1.department = "core-engine";
//        employee1.displayDetails();
//
//        employee employee2 = new employee();
//        employee2.id = 1011;
//        employee2.name = "Hari";
//        employee2.department = "core-engine";
//        employee2.displayDetails();

//        //example 1
//        Students s1 = new Students();
//        s1.name = "Radha";
//        s1.age = 1;
//        s1.rollNumber = 100;
//        s1.collage = "Universe collage of engineering life";
//        s1.markAttendence();
//        s1.print();
//
//
//        Students s2 = new Students();
//        s2.name = "Krishna";
//        s2.age = 1;
//        s2.rollNumber = 101;
//        s2.collage = "Universe collage of engineering life";
//        s2.markAttendence();
//        s2.print();
    }
}