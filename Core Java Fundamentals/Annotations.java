//Annotations--->MetaData--it is like a suppliment to the compiler 
//@Override,@Deprecated
@Deprecated//we can use it but dont use it...it has a beter alternative or it isgoing to be removed from the the language.
class X{
    
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In X");
    }
}
class H extends X{

    @Override
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In H");
    }
}

public class Annotations {
    public static void main(String[] args){
        
        H h1 = new H();
        h1.showTheDataWhichBelongsToThisClass();
        
    }
    
}