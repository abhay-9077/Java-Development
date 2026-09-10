//Need of interface

interface Computer0{
    public abstract void code();
}
class Laptop0 implements Computer0{
    public void code(){
        System.out.println("Compile..Run..In laptop");
    }
}
class Dextop implements Computer0{
    public void code(){
        System.out.println("Compile..Run..In dextop");
    }
} 
class Developer{
    public void devApp(Computer0 c1){
        c1.code();
    }
}
public class Interface2 {
public static void main(String args []){
    Computer0 c1 = new Laptop0();
    Computer0 c2 = new Dextop();
    Developer d1 = new Developer();
    d1.devApp(c2);
    }   
}
