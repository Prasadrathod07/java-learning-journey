package corejava.other;
import java.util.*;
// equals , hashCode , toString , getClass() , Clone() , Deprecated/Advanced Methods'

//root level class
//comman behaviour (inheritance)

//core methods : toString(), equals() , hascode() , getClass()
    //for cloning : clone() , for garbage collection - finalise() , threads - wait() , notify() , notifyall()



//toString - Convert anything to String

class Student {
    String name;
    int age;

    @Override
    public String toString() {
        return (name + " , " + age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) {
            return false;
        }

        //check if both classes are of type student
        // if not checked --> classCastException
        if (obj.getClass() != this.getClass()) {
            return false;
        }

        Student s = (Student) obj; //typeCast
        return (this.name == s.name && this.age == s.age);


//    @Override
//    public int hashcode(){
//
//        return Objects.hash(name , age);

//        int result = 17;
//
//        result = result *31 + age;
//        result= result * 31 + (name ==null ? 0: name.hashCode());
//        return result;
    }
//}



/*
equals() - compare 2 objects and return true and false
- compare with reference / compare references
eg :
    Student s1 = new Student("Adarsh" , 23);
    Student s2 = new Student( "Adarsh" , 23);

    - if i do - s1.equals(s2); --> this will be false because references is deferent
                               --> ==
                               -->
 */


/*
HashCode() - return integer or an object
           - Hexadecimal formate - 16 based
           - signature :
                       class Object{
                       public int hashCode(){
                       //default
                       }
    //java rule - if 2 objects are equal than this hascode must be equal

    eg :
    Student s1 = new Student("Adarsh" , 23);
    Student s2 = new Student( "Adarsh" , 23);
    System.out.println(s1.equals(s2)); //true

    - if s1.equal(s2) is true then s1.hashCode == s2.hashCode() - true
    -
    -


*/


/*
getClass()

s1.getClass().getName();
 */

/*
InstanceOf operator --> check if an object is instance of a class or any of it sub class

 */
/*
Clone () - create copy of an object - protected
         - throws classNot supported exception
         - clonable interfece implements - not every object should be clonable
           implement clonable interface for use clone()

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
 */


}
public class ObjectClass {
    public static void main(String[] args){

        //equals
        Student s2 = new Student();
        s2.name = "Prasad";
        s2.age = 25;

        //toString
        Student s1 = new Student();
        s1.name = "Prasad";
        s1.age = 25;
//        System.out.println(s1.toString());

        System.out.println(s1.equals(s2));
//        System.out.println(s1 == s2);


        //hashCode
        System.out.println(s1.hashCode() == s2.hashCode());


        //getClass
        System.out.println(s1.getClass().getName());

        System.out.println(s1 instanceof Student);
    }
}
