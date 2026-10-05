//Not every Method/class have to handle the exception they will only throw the exception...
//Ducking an exception in Java...
// means not handling an exception in the current method, but passing the responsibility to the calling method using throws

class ExceptionA{
    public void show(){
        try{
        Class.forName("Expn");//CHECKED Exception...(Should be handled)
        }
        catch(Exception e1){
            System.out.println(e1);
        }
    }
}

class ThrowsA{
    public void show1()throws ClassNotFoundException{
        Class.forName("ABC");
    }
}

public class ThrowsKeyword{
    static{
        System.out.println("Class Lodded");
    }
    public static void main (String args[])throws ClassNotFoundException{//Adding throws to main does not prevent a failure; it only prevents a compilation error. It allows the code to build successfully, but it creates a massive vulnerability at runtime.
        ExceptionA a1 = new ExceptionA();
        a1.show();//with try and catch
        ThrowsA t2 = new ThrowsA();
        t2.show1();//without try and catch...uses throws keyword.
    }
}