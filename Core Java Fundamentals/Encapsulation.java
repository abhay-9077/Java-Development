// always create instance veriable with private keyword...always
// people should be able to access them but indirectiy...by using methods.
    
    class Student1 {
    
    //DATA HIDING
    private int rollNo;//instsnce veriable
    private String name;
    private int marks;

    // 2. PUBLIC GETTERS (Read Access)
    // These allow the outside world to view the data safely.
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    // 3. PUBLIC SETTERS...Write Access
    // this..keyword points to the current object's instance variable...we use this keyword when both the veriables have the same name...rollNo=rollNo...but now we have rollNo=r..so we dont use thiskeyword
    // distinguishing it from the local parameter variable of the same name.
    public void setRollNo(int r){//r = local veriable...but if i wnat to have my local veriable and instance verible as same name...then i have to use this keyword
        rollNo = r;
    }

    public void setName(String name) {//this keyword used
            this.name = name;
    }

    // 4. SECURITY & VALIDATION
    // Because they are forced to use this method, we can filter bad data!
    public void setMarks(int m) {
        if (m >= 0 && marks <= 100) {
            this.marks = m;
        } else {
            System.out.println("Security Alert: Invalid marks provided for " + this.name );
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();

        //s1.name = "Abhay"; // The field Student.name is not visible...becoz its private
        //use public setters to assign data
        s1.setName("Abhay");
        s1.setRollNo(101); 
        s1.setMarks(77); 
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Marks: " + s1.getMarks()); 

        s2.setName("Siddhi");
        s2.setRollNo(103);
        s2.setMarks(85);  
        System.out.println("Student Name: " + s2.getName());
        System.out.println("Student Marks: " + s2.getMarks()); 
    }
}

