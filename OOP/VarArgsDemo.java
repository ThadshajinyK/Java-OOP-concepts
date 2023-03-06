package OOP;

public class VarArgsDemo {

    static int minValue(int... vals)// val is an array. but we don't know the exact no of values then put "int..."
    {   // min = least minimum value in this array
        int min=Integer.MAX_VALUE; //or can be "vals[0]"
        for(int k:vals) // for each loop
            /* ovvoru valueva eduthu k kulla assign panni check pannum. instead of access by index of the array*/
        {
            if(k<min)
                min=k;
        } //end for each loop
    return min;
    }
    public static void main(String[] args) {
        int m = minValue(5,6,7,8,3,4,6,0);
        System.out.println(m);
        int n= minValue(-2,-3,0,-8);
        System.out.println(n);

    }
}
