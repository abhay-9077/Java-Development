import javax.annotation.processing.SupportedSourceVersion;

class Students{

    int rollNo;
    String name;
    int marks;//instance veriable...If you don't initialize it, Java automatically fills it with a default value (0 for integers, null for objects)

    public char calculateGrade(){//we are not defining the grade in bracket...becoz we are supposed to calculate it using marks...if we write it in the bracket..then we have to give some input value fo grade...while calling it in the main class
         
        char grade='X';//local veriable...Whenever you create a variable inside a method that you plan to return later, it is always a best practice to initialize it with a safe default value the moment you define it!
        if(marks <=30&&marks>0){
            grade = 'F';
        }
        else if(marks<=70&&marks>30){
            grade = 'B';
        }
        else if(marks<=100&&marks>70){
            grade = 'A';
        }
        else{
            System.out.println("Invalid marks");
        }
       return grade;
    }
}

public class ArrayOfObjects {

    public static void main(String[] args) {

        Students s1 = new Students();
        s1.rollNo = 1;
        s1.marks=100;
        s1.name="Abhay";
        char finalGrade = s1.calculateGrade();
        System.out.println(s1.name + " got: " + finalGrade+" grade.");

        Students s2 = new Students();
        s2.rollNo = 2;
        s2.marks=70;
        s2.name="Yug";
        finalGrade = s2.calculateGrade();
        System.out.println(s2.name + " got: " + finalGrade+" grade.");

        Students s3 = new Students();
        s3.rollNo = 3;
        s3.marks=80;
        s3.name="Madhav";
        finalGrade = s3.calculateGrade();
        System.out.println(s3.name + " got: " + finalGrade+" grade.");

        Students students[] = new Students[3];//this is how we create the array of the objects(A array that can hold object)...now we will assign all the objects to this array.
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

//to print the address of the student

        System.out.println(s1);//will print the address of that array
        System.out.println(s2);//to print details we have to traverse the array
        System.out.println(s3);

        System.out.println(s1.name + ":"+ s1.marks);//this is one of the way to print

//to print for sll the students at once
        
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name +" scored : "+ students[i].marks + " marks");
            
        }

        for(int i =0;i<1;i++){//for blank space
            System.out.println(" ");
        }
//Enhanced for loop or polished loop
        for(Students stud :students){
            System.out.println(stud.name+":"+stud.rollNo+":"+stud.calculateGrade());
        }
    }
}

/*When you create an array of primitives (int[] nums = new int[3]), Java fills it with 0s.
But when you create an array of Objects (Students[] s = new Students[3]), Java fills it with null (nothing). */

/*
Imagine a student's marks is accidentally set to 500.
java checks the if statements. None of them match.
It hits the else block and prints "Invalid marks".
It drops down to the final line: return grade;.
At this exact moment, Java freezes. It asks, "Wait, what am I returning? The grade variable is empty!"
The Compiler's Trust Issues--
The Java compiler is smart enough to read your code before you even run it. It sees that if/else structure and realizes: "Hey, there is a path through this code where grade never gets assigned a value."
Because of that possibility, it throws a strict compile error: variable grade might not have been initialized. It won't even let you hit the run button.
*/