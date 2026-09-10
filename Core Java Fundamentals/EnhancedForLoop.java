public class EnhancedForLoop {

    public static void main (String args[]){

        // normal array
         
        int nums[] = new int[4];//array

        for(int i=0;i<nums.length;i++){//traverse
            System.out.println(nums[i]);//print
        }

        nums[0]=21;
        nums[1]=66;
        nums[3]=25;
        nums[2]=30;

        for(int j=0;j<nums.length;j++){//traverse
            System.out.println(nums[j]);//print
        }
        //Enhanced for loop
        for(int n: nums){//this does not have the iteration option...it will iterate according to thhe nuber of elements in that array(nums)

            System.err.println(n);
        }
            


                

    }
    
}
