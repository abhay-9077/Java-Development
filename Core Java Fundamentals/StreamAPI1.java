import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

import javax.swing.plaf.synth.SynthToolTipUI;

public class StreamAPI1 {
    public static void main (String args []){
        List<Integer> a1 = Arrays.asList(2,43,4,6,84,43,4,22,4,46,76,6);//In this way we can create the list and also fill the values in that array list...a1 is a data structure designed exclusively to store data. It only contains methods for managing storage, such as: add,remove,get,stream(Takes ststic data and pumps it into processing pipeline)
    
        //This was the old way...Now we have a new way.
        int sum=0;
        for (int n:a1){
            if(n%2==0){
                n=n*2;
                sum=sum+n;//this will give the sum of twice values of all the even numbers
            }
        }
        System.out.println(sum);
        //Now if we want to print all the values we can simply use normal for loop or an enhanced for loop.
        //but there is also an better way.
        //Consumer<Integer> c = m -> System.out.println(m);// we can do  not nedd to write the refrence here...we can directly call it in print method.
        //Consumer<Integer> c;//even if we don't create this refrence using this consumer Interface we can directly call it using the for each method. 
        a1.forEach(m->System.out.println(m));//this is known as for each method...and it uses the object of an Consumer(Interface) and it is an functional interface...and we also have create the object of consumer to use this method but we are directly using lambda function.
        //Now if we want to do it using stream API
        
        /*Stream*/
        //a1.Stream();//Stream is an interface....A Stream is a pipeline designed exclusively to process data. It contains all the functional programming methods, such as:Foreach,filter,map.
        Stream<Integer> s1 = a1.stream();//in s1 we have all the values present in a1...
        s1.forEach(a->System.out.println(a));//...now we have used s1 stream here...Now it cant be used again to use it again I have to create another stream or comment this part.
        //now what ever changes we make it will not be affecting the a1.//we can do changes in our stream and our original values will be un affected. 
        Stream<Integer> s2 = a1.stream();
        Stream<Integer> s3 = s2.filter(m->m%2==0);//Now how to solve that question using stream we directly didnt write a1.filter becoz...in Java, Lists simply do not have a filter() method.
        Stream<Integer> s4 = s3.map(m->m*2);
        Stream<Integer> s5 = a1.stream();//4 new sream are created which has value same as a1.
        //s3.forEach(m->System.out.println(m));//Now this will print all the even numbers from the the stream....commenting this out becoz in 34th line we have used s3 stream and stream can only be used once. 
        s4.forEach(m->System.out.println(m));
        //s1.forEach(m->System.out.println(m));///this will give error...becoz s1 is used once.
        //steams have multiple mrthods to work with.

        //Now all these changes can be done on a single stream.
        int result;
        result = a1.stream().filter(n->n%2==0).map(n->n*2).reduce(0, (g,e)-> g+e);//all operations in 1 line...now we will create a veriable and assign the value to it so that we can print it
        System.out.println(result);
        //in that reduce value syntax we have reduced the value using that syntax...now 0 is the initial value of g and e.
        /*
        Why did Java design it this way?
         Java's creators wanted to strictly separate "data storage" from "data processing." 
         If they had added .filter(), .map(), and all the other functional methods directly to the List interface, it would have made basic lists incredibly bloated, heavy, and complicated.
         Instead, they gave List just one bridge method: .stream(). 
        */
       
    }
}
