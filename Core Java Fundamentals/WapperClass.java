//Java is 99.99 percent Object oriented ....that remaning percentage is of premitive data types they does dont extends objects...other than that every class extends the class object
// for every premitive type we are going to have a class for it and that class will extend the object class.
public interface WapperClass {

    public static void main(String args []){

        int i1=7;//premitive veriable 

        //refrence veriable
        Integer i2 = new Integer(10);//old syntax we have a better syntax for it
        Integer i3=10;//this is the better way
        //This concept is called as auto-boxing 

        int i4 =i1;
        int i5=i3;// this is auto-unboxing

        String s1 = "20";
        //now if we want to convert this string into int 
        int i6 = Integer.parseInt(s1);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6*2);

    }

}
