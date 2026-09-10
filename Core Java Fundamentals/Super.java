class A {
    
    // Constructor matching the top of the screenshot
    public A() {
        System.out.println("object created");
    }

    public void show() {
        System.out.println("in A show");
    }
}

public class Super {
    public static void main(String a[]) {

        // Standard Object (Reusable)
        A a1;
        a1= new A();//A obj = new A();....both are same thing 
        a1.show(); 
        a1.show();// Reuses the exact same object in memory

        new A();//anonymous object...created in heap memory...do not have any reference value in stack so called as anonymous
        new A().show();
        new A().show();//object created once again

        //a1.show == new A()...they both are the same
        
    }
}