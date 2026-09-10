/*
static veriables have a specific area in the JVM...all static veriables are stored at one place.
so static veriable is called with the name of class....not with the name of object.
same with static method it can be called with the help of the class.
static veriable can be called inside the instance veriable.
but in static method we can only use static veriables...if we want to use instance veriable then we have to use it indirectly
we should have a object refrence for it...for using non static veriable in the ststic method 
*/

// The 'static' keyword is used for memory management and sharing state across all objects.

class StaticStudent {
    
    //Every object gets its own separate, independent copy of these in memory.
    int rollNo;
    String name;

    //Shared by EVERY object. Only ONE copy exists in memory!
    static String universityName;
    static int studentCount = 0; // Acts as a global counter for the entire class

    // Used to initialize static variables. It executes exactly ONCE when the class is first loaded.
    /*in java class loads first then methods are executed
      class loded only once...so static block is only called once and that as well in the start of the program.
      but if we dont create the object the class will not get loded....but what if we want class to load...without the objectthen we have to ise class class 
      */

    //Static block
    static {
        universityName = "Tech University";
        System.out.println("Static block executed");//****ststic block is only executed once no mater how many times you call it
            }

    // CONSTRUCTOR
    public StaticStudent(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        studentCount++; // Since studentCount is shared, every time a new student is born,the global counter goes up for everyone!
    }

    // Non-static methods can access BOTH instance variables and static variables freely.
    public void displayInfo() {
        System.out.println(name + " (Roll: " + rollNo + ") studies at " + universityName);
    }

    // STATIC METHOD
    // Belongs to the class, not the object. 
    public static void showGlobalInfo() {
        System.out.println("Total Students Enrolled: " + studentCount);
        System.out.println("University: " + universityName);
        
        // Cannot access non-static (instance) variables directly...System.out.println(name);ERROR: Cannot make a static reference to the non-static field 'name'
        // Cannot use the 'this' keyword..System.out.println(this.rollNo); // ERROR: Cannot use 'this' in a static context (there is no object!)
    }
}

public class StaticKeyword {
    public static void main(String[] args) {

        StaticStudent.showGlobalInfo(); // We call them using the ClassName directly!
        StaticStudent s1 = new StaticStudent(101, "Abhay");
        StaticStudent s2 = new StaticStudent(102, "Siddhi");
        s1.displayInfo();
        s2.displayInfo();
        StaticStudent.showGlobalInfo(); // The counter will now show 2
        
        // If one object changes a static variable, it changes for EVERYONE instantly.
        // It is best practice to modify static variables via the Class, not the object
        StaticStudent.universityName = "Global Tech College"; 
        s2.displayInfo(); 
    }
}

/*
 * ==========================================
 * HOW STATIC METHODS (LIKE MAIN) ACCESS DATA
 * ==========================================
 * 
 * 1. The Static Environment: 
 *    The main() method is static. It belongs to the class itself and runs 
 *    before any objects are created. It lives in shared class memory.
 * 
 * 2. The Direct Access Rule (Forbidden): 
 *    Static methods CANNOT directly access non-static (instance) variables 
 *    by just typing their name (e.g., marks = 100;). Instance variables 
 *    don't exist until an object is born in the Heap memory.
 * 
 * 3. The Indirect Access Rule (Allowed): 
 *    To use a non-static variable inside main(), you must bridge the gap 
 *    between static memory and object memory. This requires two steps:
 *      - Create the object: StaticStudent s1 = new StaticStudent();
 *      - Use the reference: s1.marks = 100; 
 * 
 * Summary: Direct access means using the variable's bare name. Indirect 
 * access means using an object reference (s1.) to point to it.
 */