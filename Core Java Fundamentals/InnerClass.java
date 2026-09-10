class Family{

    int members;
    public void showName(){//non-ststic method
        System.out.println("We are family");
    }
    class Mankar{
        public void showName(){
            System.out.println("Mankar Family");
        }
    }
    static class Sapkal{//this is ststic class...static can only used for the inner class 
        public void showName(){
            System.out.println("Sapkal Family");
        }
    }
}


public class InnerClass {
    public static void main(String[] args) {
        Family f1 = new Family();
        Family f2 = new Family(){
            public void showName (){//This is annonumus inner class...
            // becoz it has no name....example of method over riding...
            // by using this method we can create the object of abstract class...
            // but that will not be a object of abstract class...
            // but it will be an object of Anonymous inner class it only looks like the object of abstract class but it will be not.  
                System.out.println("in new show");
            }
        };
        Family.Mankar m1 = f1.new Mankar();
        //Family.Mankar --- mankar belongs to family
        // And by using the object of family we create the object of Mankar.
        m1.showName();
        f2.showName();

        Family.Sapkal s1 = new Family.Sapkal();
    }
}

