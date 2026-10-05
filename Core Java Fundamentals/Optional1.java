
import java.util.*;
public class Optional1 {
    public static void main(String args[]){
        List<String> L1 = Arrays.asList("Abhay","John","Siddhi","Abhi");
        Optional<String> name1 = L1.stream()
        .filter(n -> n.contains("b"))
        .findFirst();

        Optional<String> name2 = L1.stream()
        .filter(n -> n.contains("x"))
        .findFirst();

        System.out.println(name1.get());
        System.out.println(name2);
        System.out.println(name1);
        System.out.println(name2.orElse("Not Found"));
        //Now 2 names contains b but what if we dont have b in our names then it will be giving the null point exception and to solve this exception is used

        //Now if we dont want to use this optional then we can simply use orelse function after findfirst...because findfirst will always give optional ....by using or else we can convert it into string...as shown below
        String name3 = L1.stream()
        .filter(n -> n.contains("x"))
        .findFirst()
        .orElse("Not Present");
        System.out.println(name3);
    } 
}
