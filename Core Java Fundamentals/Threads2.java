//how to optimise this code...and print one hi and one hello....

class Greeting1 extends Thread{
    public void run(){
        for (int i =1;i<=8;i++){
        System.out.println("Hii");
        try {
            Thread.sleep(10);//we are maling it slip for 2 mil sec...but we need try catch here
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        }
    }
}
class Greeting2 extends Thread{
    public void run(){
        for (int i =1;i<=8;i++){
        System.out.println("Hello");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        }
    }
}
public class Threads2 {
    public static void main(String[] args) {
        Greeting1 g1 = new Greeting1();
        Greeting2 g2 = new Greeting2();
        g1.start();
        g2.start();

        // THE FIX: Stagger the second thread's start time!
        try {
            Thread.sleep(5); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // System.out.println(g1.getPriority());//tells the priority of the schedular---5 Default priority
        g1.setPriority(10);//Suggesting the priority...its not that schedular will give that priority.
        System.out.println(g1.getPriority());
    }
}

