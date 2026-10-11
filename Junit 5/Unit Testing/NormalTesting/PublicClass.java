public class PublicClass{
    public static void main(String args[]){
        Calc c1 = new Calc();
        int r1 = c1.multiply(10,2);//actual result
        int r2 = c1.devide(10,5);//actual result

        if(r1 ==20 && r2 ==2){
            System.out.println("Test Passed");
        }
        else{
            System.out.println("Test Failed");
        }
    }
}

//this was normal way of unit testing...It becomes very complicated when we are working with large programs