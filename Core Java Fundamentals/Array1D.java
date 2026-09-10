public class Array1D {

    public static int findMax(int[] arr) {//now this method will take input as an array
        
        //this is the king of hill question....the largest number from array
        //We set the "King of the Hill" to be the very first number in the array.
        int maxNum = arr[0]; 
        
        //We loop through the entire array
        for(int i = 0; i < arr.length; i++) {
            
            //THE BATTLE: Is the current array number bigger than our current maxNum?
            if(arr[i] > maxNum) {
                maxNum = arr[i]; // If yes, we have a new King! Update maxNum.
            }
        }
        
        //After the loop finishes checking everyone, return whoever is left.
        return maxNum; 
    }

    public static void main(String args[]){
        
        //array creation---when you know the values
        int[] rollNo = {2,5,6,4,99,75,3,6,6,74};

        //array creation if values are not known...for now all the values are stored as an
        int[] ages = new int [3];//Once you set this size...you can never change it.

        // we will fill the slots manually
        ages[0] = 22;
        ages[1] = 23;
        ages[2] = 26;

        System.out.println(rollNo[3]);
        System.out.println(rollNo[6]);
        System.out.println(ages[0]);

        String[] s = {"Prestige","Pirates of the Caribbean: Dead Men Tell No Tales","3 Idiots"};
        System.out.println(s[1]);
        s[0]="Interstellar";
        System.out.println(s[0]);

        int a = s.length;//It tells you exactly how many items are in the array.
        System.err.println(a);

        //print entire array

        for(int d=0;d<s.length;d++){
            System.out.println(s[d]);
        }

        //Traversing Arrays with Loops

        for (int i=0;i<s.length;i++){//never do i<=s.length...becoz the loop will try to read index 3, which doesn't exist and program will crash
            System.out.println("movies at index "+i+" is - "+s[i]);
        }

        //The Sum Calculator

        int[] regNo= {2,9,4,6,7};
        int totalSum=0;
        for(int j=0;j<regNo.length;j++){

            System.out.println(totalSum = regNo[j]+totalSum);


        // Create our array
        int[] numbers = {15, 22, 8, 42, 17};
        
        // Call the method, pass the array in, and save the result
        int biggestNumber = findMax(numbers);
        
        // Print the result
        System.out.println("The largest number is: " + biggestNumber);
        }

    }
    
}
