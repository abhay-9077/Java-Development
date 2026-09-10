enum Status1{
    Start,Walking,Running,Success;
}
public class Enum2 {
    public static void main(String args[]){
        Status1 s1= Status1.Success;

    switch(s1){
        case Start:
            System.out.println("Do fast...We dont have time");
            break;
        case Walking:
            System.out.println("Increase speed");
            break;
        case Running:
            System.out.println("Keep it up");
            break;
        default:
            System.out.println("Congrats It's done bro");
            break;
        }
        if (s1==Status1.Start) System.out.println("Do fast...We dont have time");
        else if(s1==Status1.Walking) System.out.println("Increase speed");
        else if(s1==Status1.Running) System.out.println("Keep it up");
        else System.out.println("Congrats It's done bro");
    }
}
