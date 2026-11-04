package corejava.oops;


//encapsulation , access modifies ,  getter/setter , packages , import

/*
Access modifier
-public
-default
-protected
-private

 class bankAccount{ //to class we cannot use private
    private double balance;
    //no one can access private access modifies outside of this class
    // private we can use for method, class , filed/data
    String bankName; // This automatically uses default access
    protected String ifscCode;

    //so how we will change the balance if that is private ? for that we give access by behavior/ method public
    // 2 methods - deposit and withdrawal

    public void deposit(int amount){
        balance += amount;
    }
    public void withdrawal (int amount){
        balance -= amount;
    }
}

//benefits
-protect an object's internal data from direct access
- validation before data modify
-makes code easier to maintain and mofify
-keeps related data and methods together in one class
-
*/

      //example 1
//   class bankAccount{
//       private double balance;
//       public void deposite(int amount){
//           amount += balance;
//       }
//       public void withdrawal(int amount){
//           amount -= balance;
//       }
//
//       //getters / setters
//       public double getBalance(){
//           return balance;
//       }
//   }


     //example 2
//class Student {
//    private String name;
//    private int rollNumber;
//    private String collegeName;
//
//    Student(String name,int rollNumber,String collegeName){
//        this.name = name;
//        this.rollNumber = rollNumber;
//        this.collegeName = collegeName;
//    }
////getters and setters
//    public void setName(String name){
//        //we can validate here - so this is more controller way to set
//        this.name = name;
//    }
//    public String getName(){
//        return name;
//    }
//    public String getCollegeName(){
//        return collegeName;
//    }
//}

    //example 3
//    class Student{
//        private String name;
//        private int marks;
//
//        Student(String name , int marks){
//            this.name = name;
//            setMarks(marks);
//        }
//
//        public String getName(){
//            return name;
//        }
//        public int getMarks(){
//            return marks;
//        }
//
//        public void setMarks(int marks){
//            if (marks >= 0 && marks <= 100){
//                this.marks = marks;
//            }else{
//                System.out.println("invalid marks");
//            }
//        }
//}

    //example 4
    /*
    Question — Medium: Employee Salary Management

Create an Employee class using encapsulation.

Requirements:
1. Add private fields: employeeId, name, and salary.
2. Initialise all fields using a constructor. If the starting salary is negative, display a message and use 0.
3. Provide getters for all fields.
4. Add increaseSalary(double percentage) that accepts only positive percentages.
5. Add deductSalary(double amount) that accepts only positive amounts that do not exceed the current salary.
6. Reject invalid operations with a message and retain the existing salary.
7. Do not provide a setSalary() method.
8. In main(), create two employees and verify that updating one employee’s salary does not affect the other.
     */

//    class Employee{
//        private int employeeID;
//        private String name;
//        private int salary;
//
//        Employee(int employeeID , String name , int salary){
//            this.employeeID= employeeID;
//            this.name = name;
//            this.salary = salary;
//        }
//
//        public String getName(){
//            return name;
//        }
//        public int getEmployeeID(){
//            return employeeID;
//        }
//        public int getSalary(){
//            return salary;
//        }
//
//        public void increaseSalary(double percentage){
//            if(percentage >= 0){
//                double increaseAmount = salary * percentage / 100;
//                double newSalary = salary + increaseAmount;
//                System.out.println("your salary increased by " + increaseAmount + " and now your salary is " + newSalary);
//            }else{
//                System.out.println("Invalid increment");
//            }
//
//        }
//}


           //example 5
/*
    Question : Product Stock Management

Create a Product class using encapsulation.

Requirements:
1. Add private fields: productId, name, price, and stock.
2. Initialise all fields through a constructor. If price or stock is negative, display a message and set that field to 0.
3. Provide getters for all fields.
4. Add addStock(int quantity) that accepts only positive quantities.
5. Add sell(int quantity) that reduces stock only when the quantity is positive and sufficient stock is available.
6. Add updatePrice(double newPrice) that accepts only positive prices.
7. Reject invalid operations with a message and keep the existing values.
8. Do not provide a setStock() method.
9. In main(), create two products. Verify that changing one product does not affect the other.
     */

    class Product{
        private int productId;
        private String name;
        private int price;
        private int stock;

        Product(int productId , String name , int price , int stock){
            this.productId = productId;
            this.name = name;

            if(price >= 0){
                this.price = price;
            }else{
                System.out.println("invalid price");
                this.price = 0;
            }

            if(stock >= 0){
                this.stock = stock;
            }else{
                this.stock = 0;
            }
        }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

     void addStock(int quantity){
            if (quantity > 0){
                stock = stock + quantity;
                System.out.println("new stock " + quantity +" arrived and now total stock is "+stock);
            }else{
                System.out.println("Invalid stock");
            }
    }
     void sell(int quantity){
            if(quantity>0 && quantity <= stock){
                stock = stock - quantity;
                System.out.println("Stock become " + stock);
            }else {
                System.out.println("Rejected : stock remain" + stock);
            }
    }

     void updatePrice(double newPrice) {
            if(newPrice > 0){
                System.out.println( "price become " + newPrice);
            }else{
                System.out.println("Rejected");
            }
    }

}



 public class encapsulation {
    public static void main(String[] args) {

        //example 5
        Product product1 = new Product(1011 , "watch" , 2000 , 50);
//        System.out.println(product1.getName());
        product1.addStock(200);
        product1.sell(10);
        product1.updatePrice(2500);


        //example 4
//        Employee emp1 = new Employee(1001 , "ravi" , 30000);
//        emp1.increaseSalary(10);


//        //example 3
//        Student s1 = new Student("prasad" , 23);
//        System.out.println(s1.getMarks());
//        System.out.println(s1.getName());
//
//        s1.setMarks(90);
//        System.out.println("After setting 90: " + s1.getMarks());
//
//        s1.setMarks(120);
//        System.out.println("After setting 120: " + s1.getMarks());
//
//        s1.setMarks(-10);
//        System.out.println("After setting -10: " + s1.getMarks());



        //example 1
//        bankAccount bal = new bankAccount();
//        bal.deposite(100);
////        bal.withdrawal(50);
//
//        System.out.println(bal.getBalance());
    }
}
