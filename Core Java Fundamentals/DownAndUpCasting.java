class JM{
    public void show1(){
        System.out.println("In J");
    }
}
class MM extends JM{
    public void show2(){
        System.out.println("In M");
    }
}

public class DownAndUpCasting { 

    public static void main (String[]args){

        double d = 4.5;
        int i = (int) d;//type casting
        System.out.println(d);
        System.out.println(i);

        JM j1 = new MM();// refrence of JM and Object of MM...method overriding
        j1.show1();

        //Up casting
        JM j3 = (JM) new MM();//Now the object will be of MM but we are refering to JM this is called as upcasting...refering to upper class...this ys always happerns in the backend so we dont even have to mention the casting part
        j3.show1();

        MM j2 = new MM();
        j2.show2();

        /*
        JM j4 = new MM();
        j4.show2();

        now the object is of MM still we cant call show2 becoz the refrence is of JM and it know nothing about MM class
        So we use Down Casting.
        */
       // This is down casting...j1 is made with the refrence of JM so we are down casting it so that we can use the Methods in MM class.
        MM j4 = (MM) j1 ;
        j4.show2();

    }
    
}
