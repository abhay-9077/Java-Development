//Interface is not a class...
// by default every method in interface is public & abstract
//All the veriables from the interface are by default final and ststic.

//class -> class --- extends
//interface -> Interface --- extends
//interface -> class --- Implement 
interface MobilePhone{
    String phone = "Smart Phone";//final and static so we have to assign them here only
    String type = "Touch Screen";
    String mobileName();
    int ram();
    int storage();//no error becoz this method are by default public abstract
}
interface CallingPhone{
     void show();
}
interface AdvanceMobile extends CallingPhone{
    
}
//one class can implement multiple interfaces
class Oppo implements MobilePhone,AdvanceMobile {// in implements we don't get the veriables...we only get the method.
    public String mobileName() {
        return "Reno 10 pro";
    }
    public int ram() {
        return 16;
    }
    public int storage() {
        return 512;
    }
    public void show(){
        System.out.println("Calling...");
    }
}
public class Interface1 {
    public static void main(String[] args) { 
        MobilePhone m1;//there is no problem in creating refrence...but we cant create a object from it 
        m1 = new Oppo();
        CallingPhone c1 =new Oppo();
        System.out.println(m1.ram());
        System.out.println(m1.storage());
        System.out.println(m1.mobileName());  
        System.out.println(MobilePhone.type);//static veriables do not need class...they can directly called with the help of class name
        System.out.println(MobilePhone.phone);
        c1.show();
}
}