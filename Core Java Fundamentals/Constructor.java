//Constructor is called automatically when an object is created.
// It is used to initialize the state (instance variables) of an object immediately.

class Student {
    
    private int rollNo;
    private String name;
    private int marks;
    
    // DEFAULT CONSTRUCTOR
    // If you don't write ANY constructor, Java creates a hidden blank one for you behind the scenes.
    
    public Student() {
        // This block of code runs the moment someone types: new Student()...as soon as a object is created
        System.out.println("Default Constructor called...Object created with blank data(0 and numll).");//we can either pass value and keep it blank
    }
    
    // 2. PARAMETERIZED CONSTRUCTOR (Constructor Overloading)
    // We can have multiple constructors as long as their inputs (parameters) are different.
    // This allows us to pass data at the exact moment of the object's birth!

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = -1;
    }
    public Student(int rollNo, String name, int marks) {
        // We use 'this' keyword because the parameter names match the instance variable names
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        System.out.println("Parameterized Constructor called for: " + this.name);
    }
    
    // A simple method to quickly view our object's data
    public void displayInfo() {
        System.out.println(name + " Roll: " + rollNo + " Marks scored " + marks);
    }

    // METHOD OVERLOADING

    // boolean parameter
    public void displayInfo(boolean showOnlyName) {
        if (showOnlyName) {
            System.out.println("Student Name: " + name);
        } else {
            // Reusing the first method to avoid repeating code
            displayInfo(); 
        }
    }

    //String parameter
    public void updateProfile(String newName) {
        name = newName;
        System.out.println("Profile updated. New name: " + name);
    }

    //Two parameters
    public void updateProfile(String newName, int newMarks) {
        name = newName;
        marks = newMarks;
        System.out.println("Profile updated. New name: " + name + ", New marks: " + marks);
    }
}

public class Constructor {
    public static void main(String[] args) {

        // We create it blank. If we want to add data, we have to waste 3 extra lines using setters.
        Student s1 = new Student(); 
        s1.displayInfo();

        // We create the object AND assign all its data in one single, clean line!
        Student s2 = new Student(101, "Siddhi", 85);
        s2.displayInfo(); 

        // Testing the 2-parameter constructor you wrote
        Student s3 = new Student(102, "Abhay");             

        System.out.println("\nTESTING METHOD OVERLOADING");
        s2.displayInfo();       // Triggers Version 1 (Prints everything)
        s2.displayInfo(true);   // Triggers Version 2 (Prints only the name)
        
        System.out.println("TESTING METHOD OVERLOADING");
        // Java sees 1 String, so it runs Version 1 of updateProfile
        s3.updateProfile("Abhay Mankar"); 
        
        // Java sees 1 String AND 1 int, so it runs Version 2 of updateProfile
        s3.updateProfile("Abhay", 95); 
        
        System.out.println("\nFINAL STATUS");
        s3.displayInfo();
    }
}