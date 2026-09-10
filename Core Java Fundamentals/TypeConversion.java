public class TypeConversion {
     public static void main(String args[]){
        byte a = 127;
        int b = 256;

        b=a;//this can be done normally...becoz b is bigger than a...so it can store 127 in it with out any typa casting.
        //a=b; this is not possible..becoz a does not have enough space to store 256
        int c = 2;
        byte d = 127;

        d = (byte)c;//this is type casting..c converted into byte..c value is also assigned to the d
        System.out.println(d);// d=2

        float x = 1.9f;
        int y;
        y = (int) x;
        System.out.println(y);

        // boolean type conversion is not possible

        //Type promotion 
        Byte num1 = 10;
        Byte num2 = 20;
        //Byte result = num1*num2;--> error
        int result = num1*num2;
        System.out.println(result);//200


    }
}

/*
  IMPORTANT DETAILS-->

  type casting --explisit conversion
  type conversion--implisit conversion

  byte --> int...direct conversion...implisit conversion
  int --> byte...Casting require...explisit conversion
  
  default--> double,int,char,boolean
  not default--> float and long---1.9f,3454567l--in this way they need to be mentioned.
  */

