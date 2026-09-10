//many + behaviour---behaviour will change based on some situations
/*

2 types decised based on when do they show their behaviour 

1)compile time(early binding)---overloding
2)run time(late binding)---overriding,dynamic method dispach.


*/

//Over loding----done
//Over riding----done
//Dynamic method dispach

class Computer{

}

class Laptop extends Computer{

}

class S{

    public void show(){

        System.out.println("In S");

    }

}
class K extends S {

     public void show(){

        System.out.println("In K");

    }

}
class P extends S{

     public void show(){

        System.out.println("In P");

    }

class Z {

     public void show(){

        System.out.println("In Z");

    }

}

}

public class Polymorphism {

    public static void main(String[] args) {
        
        // S k1 = new K();//type of object is S but implementation is K...THis perfectlly works 
        // k1.show();

        S s1 = new S();
        s1.show();// In S
        s1 = new K();// Now s1 is assigned new memory location in heap memory...Now it is the object of K
        s1.show();// In K
        s1 = new P();
        s1.show();// In P
        // s1=new D();...this will not work becoz D does not extends S....
        // It only works when we have child objects.

        // so in this case the same object is behaving differently....
        // THis is runtime polymorphism(Dynamic method dispach)....
        // Based on object we get different result 


        Computer L1 = new Laptop();// we are refreing this as the L1 as a computer but in actual it is a Laptop.

    }
    
}
