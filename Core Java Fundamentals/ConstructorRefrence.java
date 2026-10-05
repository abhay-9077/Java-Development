import java.util.*;
import java.util.stream.Collectors;

class Student99 {
    private String name;
    private int age;
    
    public Student99() {
    }
    
    public Student99(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

public class ConstructorRefrence {
    public static void main(String args []) {
        List<String> l1 = Arrays.asList("Abhay", "Abhi", "John", "siddhi");
        
        // Creating the list of Students using a Constructor Reference
        List<Student99> s = l1.stream()
                            .map(Student99::new)
                            .collect(Collectors.toList());

        System.out.println(s);
    }
}