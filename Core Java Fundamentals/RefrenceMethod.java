import java.util.*;
public class RefrenceMethod {
    public static void main(String args []){
        List<String> l1 = Arrays.asList("Abhay","Abhi","John","siddhi");
        List<String> cl1 = l1.stream()
                        .map(n ->n.toUpperCase())//map will give us the output in the form of new string
                        .toList();//we are converting that string into the list again
        
        System.out.println(cl1);
        
        //Now n in the labda function line is just used to calling the method for the perticular veriable or the perticular object....
        //in this case we can directly call the object or veriable by directly mentioning the method name also there is no need to write the brackets. 
        //Now we can simply pass function to an function.

        List<String> l2 = Arrays.asList("Yug","Madhav");
        List<String> cl2 = l2.stream()
                        .map(String ::toUpperCase)//Functional programming...we just have to mention where this toUpperCase belongs to.
                        .toList();//we are converting that string into the list again
        
        System.out.println(cl2);
        cl2.forEach(System.out ::println);//println belongs to system.out
    }
}
