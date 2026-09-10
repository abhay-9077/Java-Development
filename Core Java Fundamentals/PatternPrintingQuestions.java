/*The Golden Rule of Patterns:
The outer loop controls the rows (going down).
The inner loop controls the columns (printing left to right).
Use System.out.println() for the Outer loop to jump to the next line.
System.out.print() inside the Inner loop */

public class PatternPrintingQuestions {
    public static void main(String args[]){

        //Solid Square
        for(int i=1;i<=4;i++){
            //System.out.println("*");---becoz of this the first row will only have 1 star...so we will put this line after we print the first line
            for(int j=1;j<=4;j++){
                System.out.print("*");
            }
            System.out.println(" ");//outer loop should only used to jump to next line
        }

        //for blank space

        for(int m = 0; m<=3;m++){
            System.out.println(" ");
        }

        //for printing half pyramaid 

        for(int x=0;x<=5;x++){
            for(int y=1;y<=x;y++){
                System.out.print("*");
            }
            System.out.println(" ");
    
        }

        //for blank space

        for(int m = 0; m<=3;m++){
            System.out.println(" ");
        }
 
        //inverted half pyramid

        for(int a=1;a<=5;a++){
            for(int b=5;b>=a;b--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //for blank space

        for(int m = 0; m<=3;m++){
            System.out.println(" ");
        }

        //half number pyramid

        for(int k=1;k<=5;k++){
            for(int l=1;l<=k;l++){
                System.out.print(l+" ");
            }
            System.out.println(" ");
        }

        //for blank space

        for(int m = 0; m<=3;m++){
            System.out.println(" ");
        }

/*

The Goal: Write a program that prints the following pattern of 5 rows:

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1

*/

for(int s=1;s<=5;s++){
    for(int z=1;z<=s;z++){
        if((z+s)%2==0){
            System.out.print("1 ");
        }
        else{
            System.out.print("0 ");
        }
    }
    System.out.println(" ");

}

}
    
}

/*The Sneaky Error:
You are putting a star inside your jump line: System.out.println("*");.
While this visually completes the shape, 
it is technically printing one extra column outside of your inner loop's control.
 An outer loop should only jump to the next line, never print data. */