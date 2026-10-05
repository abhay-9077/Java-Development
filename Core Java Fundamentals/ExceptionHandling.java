public class ExceptionHandling {
    public static void main (String args[]){
        int i=0;
        int j=0;
        int a1[] = new int[5];

        //Always try to put critical ststements in try 
        //the movement we get exception it jumps out to the catch and executes the catch statement...
        try{
            j=18/i;//java.lang.ArithmeticException: / by zero
            if(j==0)
                throw new ArithmeticException("I dont want to print zero");//throw keyword is used to call special catch method...We can also send the message in constructor...in those curved brackets.
            System.out.println(a1[1]);
            System.out.println(a1[5]);//Exception : java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        }
        //catch will only in the case of exception
        //if-else can be used to find the specific type of an exception.
        //in catch block sequence is very important and once all catch fnds we add the semicolan after the last curly bracket.
        catch (ArithmeticException e2){//if one catch method run other catch methods it print acc to it and other methods are not even visited
            j=18/1;
            System.out.println("Can't devide by zero...So this is the default value "+ e2);//this e2 will call our constructor message
        }
        catch(ArrayIndexOutOfBoundsException e3){
            System.out.println("Stay in your limits");
        }
        // at last use exception class which handles everything...every exception...it is the parent class of allthe exceptions and it can also handles all the exceptions.
        catch(Exception e1){//in this statement exception is the class and the e1 is the object...it can be any thing e1,e2,e3,e4,etc.
            System.out.println("Exception : "+ e1);
        };
        //we can didectly ask java...what type of excp is this and we can return data accordingly.
        //in multiple exception case we have to use multiple catch method.
        System.out.println(j);
        System.out.println("Bye");
    }
}
