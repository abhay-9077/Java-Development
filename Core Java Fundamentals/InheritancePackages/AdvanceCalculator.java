package InheritancePackages;

public class AdvanceCalculator extends Calculator{

    public float mean(int a1,int a2){
        
        int sum=add(a1,a2);
        float m = sum / 2;
        return m;
    }
}

//this is single level inheritance
