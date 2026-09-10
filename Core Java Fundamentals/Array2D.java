public class Array2D {
// dynamic array...when we dont know the values.   
    public static String method1(String[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                
                if(i == j) {
                    arr[i][j] = "X"; // Fills the diagonal
                } else {
                    arr[i][j] = "O"; // Fills everything else
                }
                
                // Print side-by-side with a space
                System.out.print(arr[i][j] + " "); 
            }
            // Jump to a new line after each row is done
            System.out.println(); 
        }
        return "WIN";
    }

    public static void main(String args[]) {

        //traversal of multi-dimentional array
        int nums[][]=new int[4][8];
        for(int a=0;a<4;a++){
            for(int b=0;b<8;b++){
                System.out.print(nums[a][b]+" ");
            }
            System.out.println();
        }

        //generate randome values
        for(int a=0;a<4;a++){
            for(int b=0;b<8;b++){
                nums[a][b]=(int)(Math.random()*10);//Math.random() is a built-in method that generates a decimal number between 0.0 and 0.999 (for example, 0.4582).If you cast 0.4582 directly into an int, Java doesn't round it. It just violently chops off the decimal part, leaving you with 0. If you run it like that, your entire board will just be zeros!
                System.out.print(nums[a][b]+" ");
            }
            System.out.println();
        }


        
        // when we know the values
        System.out.println("Manual Board");
        String[][] manualBoard = {
            {"X", "O", "O"},
            {"O", "X", "O"},
            {"O", "O", "X"}
        };
        System.out.println("Center piece is: " + manualBoard[1][1]);
        System.out.println();


        
        System.out.println("Dynamic Board");
        String[][] s = new String[3][3]; 
        
        // We capture and print the "WIN" return value
        String result = method1(s); 
        System.out.println("Game Result: " + result);

    }
}