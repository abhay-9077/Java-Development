abstract class  Car{

    // public void drive();
    //created this method but not sure what to do with it.
    // so we will simply declare this method instid of defining it
    // so that no one can create the object of it.
    
    // but if some one want to extend this car feature they should have this method drive...and we can force it using the abstract keyword.
    public abstract void drive(); 
    // and abstract method can only defined by the abstract class
    public abstract void fly();

    public void playMusic(){

        System.out.println("play music");

    } 
}

abstract class WagonR extends Car{
// now extended class from adstract so it should have the abstract keyword.
    public void drive(){
        System.out.println("Driving...");
    }
    // if we are unable to call all the methods from the abstract class then we have to make this class as an abstract class
    // this is not calling fly so lets convert this to a abstract class. 
}

class UpdatedWagonR extends WagonR{//concrete class...we can create the object of this concrete class
    public void drive(){
        System.out.println("Driving...");
    }
    public void fly(){
        System.out.println("Flying...");
    }
}
public class AbstractKeyword {
    public static void main(String a[]){

        // Car c1 = new Car();...we cant create the object of abstract class...
        // but we can have the refrence of Car
        Car c1 = new UpdatedWagonR();
        c1.drive();
        c1.playMusic();
        c1.fly();

    }
    
}
