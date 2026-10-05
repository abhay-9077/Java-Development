class Greeting1 extends Thread{
    public void run(){
        for (int i =1;i<=100;i++){
        System.out.println("Hii");
        }
    }
}
class Greeting2 extends Thread{
    public void run(){
        for (int i =1;i<=100;i++){
        System.out.println("Hello");
        }
    }
}
public class Threads1 {
    public static void main(String[] args) {
        Greeting1 g1 = new Greeting1();
        Greeting2 g2 = new Greeting2();
        g1.start();//once this execution is done then only...execution of nect line will occure...Normally this occurs.
        g2.start();
        // But if we want to execute both of them at the same time....
        // Then we have to make this objects as threads...
        // For that wwe can extend the class using thread.
        // once the class extends the thread class all the methods are converted into threads
        // so instid of calling the method by its name...we can directly call by using start keyword.
        //but one more thing every thread extended class should have a run method
        //still for i=10..no change but for i=100..very large change will be seen.
    }
}
