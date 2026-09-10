/*final Keyword
veriable-- becomes constant...cant be changed
class--cant inherit or extend...cant be a parent
method--stops method over riding
*/


// using class
final class Calculator1{

    public void show(){

        System.out.println("In Calculator show");

    }
    public void add(int a,int b) {

        System.out.println(a+b);

    }

}

// class Calculator2 extends Calculator1{//Not possible becoz final class can never be a parent class...It cant do inheritance
// }

class Animal1{
    public void cell(){
        System.out.println("Multicellular");
    }
}

class Human1 extends Animal1{
    public void cell(){
        System.out.println("Tissue level--Organ system");
    }
}


public class FinalKeyWord {

    public static void main (String args[]){
        

        //using veriable
        int num = 8;
        num = 10;
        //this works
       
        //but if we want to create a veriable which can't be changed then we use final
        final int a = 10;
        // a =25;...it will give error...can't change the value of a constant value.

        Calculator1 c1 = new Calculator1();
        c1.show();
        c1.add(2,3);

        Human1 H1 = new Human1();
        H1.cell();//Tissue level--Organ system
        //this is over riding...becoz of same name and perimeter...the parent cell method is over ridden

        //if we want no one to over ride our method then we can use final keyword to stop the over riding of the method. 
        // ex: in animal class---final cell(){};...Now it cant be over ridden


    }
    
}
