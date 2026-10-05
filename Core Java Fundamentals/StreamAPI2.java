import java.util.*;
import java.util.stream.Stream;

public class StreamAPI2 {

    public static void main(String args[]){
        List<Integer>l1= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        
        Stream<Integer> sortedValues = l1.stream().filter(n->n%2==0).sorted();//We are not applying reduce because it willmonly give only 1 value...and this sortedValues veriable is a arrayList It should have multiple values  
        sortedValues.forEach(n -> System.out.println(n));//to print the sorted values
        Stream<Integer> a1;//new stream created and now this can be used any where
        a1=l1.stream();// .stream function is used to convert the arrey list to the stream...with out it there would be a type mismatch

    }
    
}
/*
Now we have done filtering...by default it is done by 1 thread only...
what if we have to do filtering by using multiple threads....
in that case instid of using .stream() function we will simply use parallel stream function.
.
But we can't do sorting by using parallel stream becoz sorting needs all the elements together
*/
