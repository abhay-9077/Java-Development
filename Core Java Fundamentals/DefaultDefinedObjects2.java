class Laptop2{
    int price;
    String model;
    String serial;
    //every time we try to print the object it will call the toString method...
    //this is by default and it will print class_name + @ + Heap_code(in hexadecimal)
    //so now we will define toString method in our code according to our convinence. 
    
    public String toString(){

        return model + " : "+ price; 
    }

    public boolean equals1(Laptop2 that){

        if(this .model.equals(that.model) && this.price == that.price)//== for int & equals for string
            return true;
        else 
            return false;
    }
        // we also dont need this entire if else we can simply print the if condition and it will return true or false
        
        /*in if else we are only returning the true or false value...so we can simply return the values and string will compare it by it self.*/
        public boolean equals2(Laptop2 that){

            return this .model.equals(that.model) && this.price == that.price;
            }

        //In case if we want an equal objects...then we can use source actions (predefined code)...Generate hashCode and equals...select all the veriables we want ...and enter   

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + price;
            result = prime * result + ((model == null) ? 0 : model.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Laptop2 other = (Laptop2) obj;
            if (price != other.price)
                return false;
            if (model == null) {
                if (other.model != null)
                    return false;
            } else if (!model.equals(other.model))
                return false;
            return true;
        }    
}

public class DefaultDefinedObjects2 {

        public static void main (String [ ] args){
        Laptop2 l1 = new Laptop2();
        l1.price=1000;
        l1.model="G15";

        Laptop2 l2 = new Laptop2();
        l2.price=1000;
        l2.model="G15";

        System.out.println(l1);
        System.out.println(l2);

        // how do we compare if this two objects are same or not...the values are same but are the objects same
        // we can directy undernstand it by printing the object or Object.toString(both are same)....this will directly print the address from the memory
        // but in this case since we have definde to.String object to not print the address
        // In this case we can use equals method (pre defined in java) or we can use boolean

        boolean r1 = l1==l2;
        System.out.println(r1);//false

        boolean r2 = l1.equals1(l2);//true
        boolean r3 = l1.equals2(l2);//true

        /*equals predefined--//this is comming from object class...it compares objects by hexa decimal value of heap code...and we dont want it so we will define equal in our code
        public boolean equals(Object obj) {
        return (this == obj);
        }
        */
        System.out.println(r2);//Before defining equal false and now it will give true
 
        System.out.println(r3);
        


    }
    
}
