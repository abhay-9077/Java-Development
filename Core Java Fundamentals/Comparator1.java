import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;//Used to pass our ownlogic for sorting
import java.util.List;

class Students1{

    int age;
    String name;

    public Students1(int age, String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Students [age=" + age + ", name=" + name + "]";
    }
    
}
public class Comparator1 {
    public static void main (String args[]){
        List<Integer> a1 = new ArrayList<Integer>();
        a1.add(2);
        a1.add(5);
        a1.add(1);
        a1.add(9);
        a1.add(2);

        System.out.println("Sort this Array list : " + a1);

        Collections.sort(a1);
        System.out.println("Sorted by using .sort : " + a1);

        Comparator<Integer> a3 = new Comparator<Integer>() { //comparator is an interface...we saw by ctrl + R.Click
        
            public int compare(Integer i,Integer j){//we saw this syntax from the the interface where it is defined...type we are giving as Integer class...becoz collection.
                if (i%10>j%10)
                    return 1;
                else
                    return -1;
                }
        };

        //if sort according to our logic...sort according to the unit digit
        List<Integer> a2 = new ArrayList<Integer>();
        a2.add(21);
        a2.add(57);
        a2.add(11);
        a2.add(92);
        a2.add(28);
        Collections.sort(a2,a3);//a3 is used to alter the normal sorting logic to...sorting based on unit digit.
        System.out.println(a2);

        List<Students1> s1 = new ArrayList<>();
        s1.add(new Students1 (23,"Abhay"));
        s1.add(new Students1 (20, "Siddhi"));
        s1.add(new Students1 (22,"Isha"));
        s1.add(new Students1 (25,"Akshay"));
        s1.add(new Students1 (26,"Abhi"));
        
        for (Students1 s : s1)
            System.out.println(s);

        // now we want o sort this values based on their age.
        //Collections.sort(s1);....not work becoz it's type is Students1 Not Integers...to sort directly.
        //so we have to use comparator

        Comparator<Students1> s2 = new Comparator<Students1>() {
            public int compare(Students1 i,Students1 j){
                if(i.age>j.age)
                    return 1;
                else
                    return -1;//this logic is always used for swaping
            }
        };
        Collections.sort(s1,s2);//this s2 has all the altered logic.
        System.out.println("Sorted Students by Age:");
        for (Students1 s : s1) {
            System.out.println(s);
        }
    }
}

//Seee the diff between Comparable and comparator.