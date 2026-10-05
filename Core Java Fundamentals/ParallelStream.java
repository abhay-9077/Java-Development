//Parallel stream is used when we have to do the filtering but by using multiple threads
//parallelStream()---creates multiple threads for us
//Sorting can't be used in a parallel stream...becoz for sorting it need all the data at one place 
//overall use parallel stream when the values are not dependant


import java.util.*;
import java.util.stream.Stream;

public class ParallelStream {

    public static void main(String args[]){
        // List<Integer>l1= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // Stream<Integer> sortedValues = l1.parallelStream().filter(n->n%2==0);//Now this parallel stream will create multiple thread with it(Means multiple conditions in the filter).
        // sortedValues.forEach(n -> System.out.println(n));
        int size=10_000;//to differentiate between the number of zero we have used underscore
        List<Integer> l2 = new ArrayList<>(size); 
        Random r1 = new Random();

        for(int i=1;i<=size;i++){//loop is used to this array of size 10000 and in this loop we are...writing that each time we traverse asign any random value to the this arrey   
            l2.add(r1.nextInt(100));//we could have added the values one by one but we are adding it randomly by creating a object of Random cladd...we are doing this because parallel stream is used when we have huge amount of data.  
        }
        System.out.println(l2);
        //now we have the arrey we will multiply all the values by 2 and then add 
        Stream<Integer> multipleBy2 = l2.stream().map(n->n*2).map(n->n+2);
        System.out.println(multipleBy2);
    }
    
}
//parallel stream will take more time.....because it creats multiple threads and creating threads takes time....but this is wrong becoz...Parallel is faster 
