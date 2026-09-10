//Object class --- every class in java extends the java class...by default..we dont have to mention it.


class Laptop1{
    int price;
    String model;
}
public class Object1 {

    public static void main (String [ ] args){
        Laptop1 l1 = new Laptop1();
        l1.price=1000;
        l1.model="G15";
        System.out.println(l1);
        System.out.println(l1.toString());//every time we try to print the object it will call the toString method...this is by default.
    }
        
        /*OUTPUT --- Laptop1@3fee733d
         this is a --- Class Name +@+ Hash code...which has been converted into hexa decimal values.
         
        hash is a very simple concept which trys to create a single string of all the data we have
        
         // This is that toString method---Default method...present in class Object---again this is default class
        public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
         */

        // but if we defined method called toString then it will return whatever the string is returning.

}
