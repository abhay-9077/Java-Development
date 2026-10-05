import javax.sql.rowset.spi.SyncResolver;

@FunctionalInterface 
interface ToAdd{
    int add (int a,int b);
}
//Normal way--
// class FITA implements ToAdd{
//     public int add (int a, int b){
//         int c = a+b;
//         return c;
//     }
// }
public class FunctionalInterface2 {
    public static void main(String[] args) {
        
    
    ToAdd t1 =(a,b)-> a+b;//this is the beuty of lambda expression
    //always put the semicolan after the curly bracket of expression...now we can also remove that curly bracket becoz only one line of code is there.
    //mow we have the only one statement and that statement itself cant be return...so we can simply remove it.
    int result = t1.add(10,20);
    System.out.println(result);
    }
}
// lambda expression only works with the functional interface...becoz in case of multiple methods it get confuse which method it have to implement.
