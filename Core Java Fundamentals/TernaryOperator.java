public class TernaryOperator {
     public static void main(String args []){
        
        String x;//Becoz output is string
        x=(100%2 == 0)?"100 is even" : "100 is odd";
        System.out.println(x);

        int number = 100;//for geting int as output
        int result = (number % 2 == 0) ? 1 : 0; 
        System.out.println("The result is: " + result);
     
    }
}

/*If you have more than two possible outcomes, stick to standard if-else or switch statements to keep your code clean and readable */