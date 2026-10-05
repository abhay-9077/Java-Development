//if the class is not present in java.lang then we have to explisictly mention it.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;

public class Inputs1 {
    public static void main(String[] args) throws IOException  { 
        
        System.out.println("Enter a Number");//Out is the object...of print stream class...which is created inside system class...Println function
        
        int num = System.in.read();//Gives ASCII Value..unique value assigned for every latter and number...it only considers 1 letter or number no matter what the input is
        System.out.println(num-48);//48 is the value for zero.
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age " );
        int num1 = sc.nextInt();
        sc.close();
        


    }
}
