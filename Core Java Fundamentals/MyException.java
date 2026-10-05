class AbhayException extends Exception{
    public AbhayException(String s1){
        super(s1);//now our meaasge will be printed...what ever we pass in the constructor.
    }
}
public class MyException {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0)
                throw new AbhayException("Invalid input");
            }
            catch (AbhayException e1){
                j=18/1;
                System.out.println("that's default Output j = "+ j +"This is "+ e1 );//t the end of this code our message will be printed...whatever we pass in the constructor...after a colen and space
            }
        
    }
}
