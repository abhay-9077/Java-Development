//Lambda expression can only be used in the functional interface.
@FunctionalInterface //to make sure we only have only one interface here
interface Functional{
    void show();
}//SAM = single abstract method interface.
class AFI implements Functional{
    public void show(){//we have to add public becoz we cant reduce the visiblity
        System.out.println("In a functional interface");
    }
}
public class FunctionalInterfac1 {
    public static void main(String args[]){
        Functional f1 = new AFI();
        f1.show();
        //or we can aslo do 
        Functional f2 = ()->System.out.println("In Ann Inner Class...we have called this object using the lambda expression");
        //this is the lambda expression...the arrow is lambda and the entire line is expredssion...this is syntatical suger...we are reducing the code.
        //now in this statement we only have one ststement so we can also skip curly bracket...but if we had many statements we need curly bracket
        f2.show(); 
        // now if the values are passed in that bracket then.
        //Functional f2 = (int i)->System.out.println("In Ann Inner Class...we have called this object using the lambda expression");...the values will be passed in that bracket
        //we also dont need to mention the type... becoz we had already did it...and if there is only 1 veriable we can also avoid the brackets

    }
}