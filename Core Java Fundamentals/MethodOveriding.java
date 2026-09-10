class J{

    public void show(){
        System.out.println("in J show");
    }

    public void confi(){
        System.out.println("in J confi");
    }
}
class B extends J{

    public void show(){
        System.out.println("in B show");
    }
}
public class MethodOveriding {

    public static void main(String[] args) {
        B b1 = new B();
        b1.show();//in b show....since both have the same name..same perimaters...same type then the prefrence will be given to the self features and parent parent features will be avoided
        b1.confi();//in j confi
    }
}

