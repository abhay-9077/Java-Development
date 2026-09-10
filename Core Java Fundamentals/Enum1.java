enum Status{//this Status is a class here...But we cant extend enum class...apart from this everything is the same
    Running,failed,Pending,Success;//all these are objects of type status---Named Constants.
    //all these status have the numbering which starts from zero...by using ordinal we can find that number
}
public class Enum1 {
    public static void main (String args[]){
        Status s1 = Status.Running;
        Status s2 = Status.Success;
        System.out.println(s1);
        System.out.println(s1.ordinal());
        System.out.println(s2);
        System.out.println(s2.ordinal());
        Status[] s3 = Status.values();//for all values in the form of array...so we also have to use status by using the square bracket.
        // System.out.println(s3);....this will print the address...[LStatus;@3fee733d the address..
        // to print all the values we can use for loop.
        for(Status s : s3){//this will print all the status
            System.out.println(s+" : " + s.ordinal());
        }
        System.out.println(s1.getClass().getSuperclass());
        //class java.lang.Enum---output
        // enum in java class extends enum.
    }
}
