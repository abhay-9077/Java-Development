import java.util.Scanner;

public class LoopsInJava {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Number of holidays: ");
        int holidays = sc.nextInt();
        
        for (int i = 1; i <= holidays; i++) {
            System.out.println("Sunday " + i + " --- Holiday");
        }
        
        // Loop for working days
        int a, b, OverTime;
        
        for (a = 1; a <= 6; a++) {
            System.out.println("Working Day---" + a);

            // 1. Normal working hours first
            for (b = 1; b <= 8; b++) {
                System.out.println("Hour " + b);
            }

            // 2. Overtime loop after normal hours
            System.out.print("Over time hours = ");
            OverTime = sc.nextInt();

            int otCounter = 1; // Counter to track overtime loops

            // Only run the do-while loop if they typed a number greater than 0
            if (OverTime > 0) {
                do {
                    System.out.println("Working Day---" + a + " Over Time Hour---" + otCounter);
                    otCounter++; 
                } while (otCounter <= OverTime); 
            }
        }
        
        System.out.println("Bye");
        sc.close();
    }
}