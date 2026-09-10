class Halfpyramid
 {
    public static void main(String[] args){
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 1 ; j < i ; j++){
                if((j+i)%2 == 0){
                    System.out.print("0");
                }else{
                System.out.print("1");
                }
            }
            System.out.println();
        }
        
    }
}
/*

The Goal: Write a program that prints the following pattern of 5 rows:

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1

*/