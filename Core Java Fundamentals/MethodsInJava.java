/*In java we cant call method inside the method...
so we cant create another method in main
***R*** veriables created in method dies inside the method...
so if we intend to use them we should declare them globally(in the class) */

public class MethodsInJava {
    int s=300;
public static int sum(int a ,int b){//static means the main method is allowed to use it without creating an Object...
// int means it returns int...return and print are the different things.
    int sum = a+b;
    //a=10;---this does not work because...
    // The whole point of parameters (int a, int b) is that the method does not know what the numbers are until the main method passes them in.
    //b=20;
    return sum;//passes the final value back to who ever calls the method.

}

public static int updateNum(int s){
    s=200;
    return s;
}

public static int multiply(int a, int b){
        return a * b;
    }
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }

    public static int calculatorArea(int x){
        return x*x;
    }

    public static int calculatorArea(int x,int y){
        return x*y;
    }

    public static boolean isPrime(int n){
       
       for(int p=2;p<=n-1;p++){
        if(n%p==0){
            return false;
        }
       }
        return true;
       }
    
 public static void main( String args []){//void dont return any thing at all.
       
    //int result= sum--->Since your method asks for two int values, you must provide them when you call it...so this does not work.
    int result= sum(10,20);
    System.out.println(result);
    System.out.println(multiply(5, 10)); 
    System.out.println(multiply(2, 3, 4)); 
    System.out.println(multiply(2.5, 4.0));
    System.out.println(calculatorArea(2));
    System.out.println(calculatorArea(2,4));

    int s=100;
    // Question A: What prints here?
    System.out.println(s); //It will print 200...Because of the Golden Rule. 
    // The s inside the main method is "closer" than the s at the top of the class
        
    // Question B: What prints here?
    System.out.println(updateNum(88));
    /*Result: It will print 200.
Why: You pass 88 into the method. 
Inside updateNumber, the local parameter s temporarily becomes 88.
But on the very next line, you say s = 100;. 
It changes its own local s to 100 and returns it. */

     System.out.println(isPrime(3));
    
    }
    
}
