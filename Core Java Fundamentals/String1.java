/* String is an object
Java treats a String as an array of characters
Strings are IMMUTABLE - they cannot be changed once created. */

public class String1 {

    public static void main(String args[]) {

        String sentence = "java is fun";
        
        int l = sentence.length();
        System.out.println("Length: " + l); 
        
        char a = sentence.charAt(5);
        System.out.println("Character at index 5: " + a); 
        
        String s = sentence.substring(8, 11); 
        System.out.println("Substring: " + s); 
        
        // --- THE IMMUTABILITY TRAP ---
        
        // This does NOTHING to the original variable!
        sentence.replace("fun", "easy"); 
        System.out.println("Failed replacement: " + sentence); // Still prints "java is fun"
        
        // You MUST overwrite the variable to save the change
        sentence = sentence.replace("fun", "easy");
        System.out.println("Successful replacement: " + sentence); // Prints "java is easy"
        
        //the object of the string or we can also say string veriable
        String s1 = new String("String Object called");//if nothing is passed in the constructor then it show 1 blank line in terminal.
        System.out.println(s1);
        System.out.println(s1.hashCode());//C is capital h is not
        System.out.println("Concatenation works on string object---"+s1);
        System.out.println(s1.charAt(5));
        System.out.println(s1.concat(" & concatination function is used"));
        s1=s1+" Cant Append";
        s1=s1+" can be updated by the value again and again";//concatination always works...because in concatination we are judt changing the address of the veriable...old will remain as it is...and new object with the concatenated form will be created...Now the old s1 is eligible for the garbage collection..it will be removed from memory after some time
        System.out.println(s1);

        String s2="Abhay";//in this case only 1 object created...which has its allocated space in the heap memory
        String s3="Abhay";//s2,s3,s4 these are the refrences which are stored in stack...every refrence in a stack has the memory address(from heap)
        String s4="Abhay";//so all three objects will be showing the exact same address...because of String constant pool...it make shure that same string should not be allocated diff addresses in the heap memory
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s2==s3 && s3==s4 && s2==s4);//Hence proved...
        
        //StringBuffer & StringBuilder---provide a way to access the mutable string

        StringBuffer s5 = new StringBuffer("Abhay Mankar");//it gives us the buffer size of 16 bytes
        System.out.println(s5.capacity()+" - bytes is the capacity of string buffer"+" It always has 16 bytes space as a buffer");
        System.out.println(s5.append("---Append Done"));
        System.out.println(s5.deleteCharAt(6));
        s5.ensureCapacity(100);     

        //to convert it into a string
        String s6 = s5.toString();
        System.out.println(s6);
           
        //String buffer is thread safe and string builder is not


        //String s2="abhay";...does not work...imutable strings
    /*this object is created in the heap memory...heap has no fix size...
    we dont have to write a new string always we only create the string it will create the object by it self...with out writing any new key word
    */
    
    } 
}