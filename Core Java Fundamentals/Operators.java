public class Operators {
    public static void main(String args[]){
        int a=10;
        int b=20;
        int c=a+b;
        int x=a-b;
        int y=a*b;
        int z=a/b;//quotient
        int m=a%b;//remainder

        System.out.println(x);
        System.out.println(c);
        System.out.println(y);
        System.out.println(z);
        System.out.println(m);


        byte d=10;
        byte e=20;
        //byte f=d+e; // This will give error because d+e is int type...when you perform arithmetic on byte values, they are automatically promoted to int
        byte f=(byte)(d+e);// This will work because....we are type (explicitly) casting the result back to byte
        System.out.println(f);

        int i=10;
        i = i+1;
        System.out.println(i);

        i +=10;//this means add i with 10
        System.out.println(i);

        i++;
        System.out.println(i);

        i--;
        System.out.println(i);

        i++;//post increment
        ++i;//pre increment

        System.out.println(i);//i=23

        int result = ++i;
        System.out.println(result);//i=24

        int result2 = i++;//i is first fetched then updated...so fetched value is printed
        System.out.println(result2);//i=24 printed-->but the value of i is 25 now
        System.out.println(i);//25


        /*---Relational Operators---*/ 

        boolean p = a > b;  
        System.out.println(p);

        boolean q = a < b;
        System.out.println(q);

        boolean r = a >= b;
        System.out.println(r);              

        boolean s = a <= b;
        System.out.println(s);

        boolean t = a == b;
        System.out.println(t);

        boolean u = a != b; 
        System.out.println(u);

        /*---Logical Operators---*///short circuit operators
        boolean v = (a > b) && (a < b);//if first condition is false...second condition will not be checked...becoz both conditions should be true for AND operator to return true
        System.out.println(v);  

        boolean w = (a > b) || (a < b);//even is true...it will return true...becoz only one condition should be true for OR operator to return true
        System.out.println(w);

        boolean num1 = b>a;
        boolean num2 = a<b;
        boolean num3 = a==b;    
        boolean num4 = a!=b;
        System.out.println(num1 && num2);//true
        System.out.println(num3 || num4 || num1);//true 
        System.out.println(!(num1 && num2));//Negation operator...True --> False.

        
    }
    
}
