import java.util.Scanner;
public class ConditionalStatements {
    
    public static void main(String args []){
        
        int x;
        int y = 21;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age : ");
        x=scanner.nextInt();

        if(x>=y && x<110){
            System.out.println("Can vote");
        }
        else if(y>x && x>0 ){
            System.out.println("Can't vote");
        }
        else{
            System.out.println("Invalid age");
        }

        float a;//we can store any number in it...decimal or normal
        System.out.print("type the number for even count down: ");
        a=scanner.nextFloat();
        if(a%2==0)
            System.out.println("a is an even number");
        
        do{
            System.out.println("Countdown : "+ a);
            a=a-2;
        } while (a>0);
    scanner.close();//When you create a Scanner to read from System.in, Java opens a physical connection to your computer's input stream (your keyboard).If you do not close this connection when you are done, it remains open in the background. This can lead to a resource leak
    }
}
