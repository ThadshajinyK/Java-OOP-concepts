package OOP;

public class WrapperDemo {
    public static void main(String[] args) {
        //Integer i2 = new Integer(10); // old version definition

    float f;

        Integer i1= Integer.valueOf(1); //Boxing
        int j= i1.intValue(); //unboxing

        Integer i2 = 20; //compiler accept this // autoboxing
        int k=i2; // auto unboxing

        String s = "123";
        int i = Integer.parseInt(s);
        System.out.println(i);
    }
}
