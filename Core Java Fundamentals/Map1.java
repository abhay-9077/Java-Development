import java.util.*;


public class Map1 {
    public static void main(String[] args) {

        Map<String,Integer> students = new HashMap<String,Integer>(); 
        students.put("Abhay",100);
        students.put("Om",65);
        students.put("Sid",83);
        students.put("Amar",15);
        students.put("Onkar",03);
        students.put("Abhay",99);// one key must have 1 value


        System.out.println(students);//even this eill not follow the sequence
        System.out.println(students.get("Abhay"));
        System.out.println(students.keySet());
        System.out.println(students.values());
        
        for(String name : students.keySet()){
           System.out.println(name + " - " + students.get(name));
        }

    //we also have Hash table,,,,and both work almost same...the only difference is hashtable is more syncronised...in case of multiple threads

    } 
}
