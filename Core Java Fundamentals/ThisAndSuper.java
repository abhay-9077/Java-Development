/*every constructor has a method in it called super...even if we dont mention it 
so every constructor first statement is super...it means call the constructor of a super class
*/
//every class extends object class
class M extends Object {//every class extends object
    public M(){//constructor

        super();//syntax for super method...it means call the constructor of a super class
        System.out.println("in M");
    } 
    public M(int y){//constructor
        System.out.println("in M(pc)");//this will not be called by the object of N...we have to create the object of M and run it with certain perameters.
    } 
}
class N extends M{//N extends object but indirectly 

    public N(){//constructor
        System.out.println("in N");
    }
    public N(int x){

        super(x);//to call perimaterised construtor of super lass instid of default one.
        System.out.println("in N (pc)");
    }
}
public class ThisAndSuper {

    public static void main(String[] args) {
        
        N n1 = new N();//This is the object of N but it will also call the super class...even if super class does not have any object...default constructor will be called
        N n2 = new N(10);//perameterised constructor will be called
        /*
        now M will be called
        in M
        in N
        in M
        in N (pc) 
        */
       M m1 = new M(1);// this will print -- in M(pc) only
       /*in M
         in N
         in M
         in N (pc)
         in M(pc) */

         ///IMP IF WE HAVE TO CALL BOTH THE CONSTRUCTOR THEN SIMPLY WE CAN USE THIS KEYWORD INSTID OF SUPER
        

    }
    
}
