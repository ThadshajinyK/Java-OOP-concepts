package OOP;

public class PassingRefDemo {
    static int increment(int a){
        return ++a;
    }

    public static void main(String[] args) {
        int a=10;
        a= increment(a);
        System.out.println(a);
    }
}
