public class TryWithResources {
    public static void main(String[] args) {
        int i,j;
        i=0;
        j=0;
        try{
            j = 18/i;
            System.out.println("Bye_of_Execution...No Exception Occured");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
            System.out.println("Bye_of_Exception...Exception Occured");
        }
        finally{//can be used to close the class when the we are taking input from the user
            System.out.println("Bye_of_Finally...It will always be printed");//what ever the result...it will print bye in any case exception or not.
        } 
        //or in resent versions of java we have seen that If we create the object in buffer reader then we can directly it will get closed once try execution is done...it is a auto closable interface.
    }
}
