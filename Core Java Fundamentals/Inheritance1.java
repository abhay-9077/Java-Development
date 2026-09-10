//Syntax to import the packages from different folder....
// and also make sure all the class and methods are public
//Inheritance is only possible in same folder or same file....if this is not the case then we have to import the class using the package name
import InheritancePackages.AdvanceCalculator;
import InheritancePackages.Calculator;
import InheritancePackages.VeryAdvCalc;
//we can also use oer defined classes / interfaces
import java.util.ArrayList; 
//enable us to use Arraylist...Basically we have the java folder and inside that folder we have the util folder
//whichever class we use in java belongs to a package/folder...System,String
import java.lang.*;
//By default imported in every package
//if in 1 folder we have multiple files then we can simply write the name of the folder.* ---this calls all the files from that specific folder----NOT all the folders
//if we have folder inside folder---- then we can simply do...import folder.inside_folder_name;

public class Inheritance1 {

    public static void main(String[] args) {

        Calculator c1=new Calculator();

        int t1=c1.add(11, 20);
        int t2=c1.divide(10, 2);
        int t3=c1.sub(30, 29);
        int t4=c1.multiply(1, 0);

        System.out.println(t1+" "+t2+" "+t3+" "+t4);

        AdvanceCalculator c2=new AdvanceCalculator();
        float t5=c2.mean(11, 20);
        System.out.println(t5);

        VeryAdvCalc c3=new VeryAdvCalc();
        double t6=c3.power(2, 5);
        System.out.println(t6);
    }
    
}
