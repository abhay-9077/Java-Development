public class JaggedArray{

    public static void main(String args[]){

        int a[][] = new int[3][];//jagged array....when number of rows are defined but the number of columns are not defined
        //now we have to indivisually specify the colums
        a[0] = new int[1];
        a[1] = new int[2];
        a[2] = new int[7];
        //a[3] = new int[4];...not possible becaues we have defined 3 rows earlier...so 0-2 index

        for(int i=0;i<=2;i++){//Mistake--Because of zero-based indexing, starting at 1 completely ignores the first row (a[0]) and the first column of every row...so we can also use i<a.length.
            for(int j=0;j<a[i].length;j++){//For the inner loop, you must ask for the length of that specific row, not the master array..now it will specificly check the length of each row
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


    }
}