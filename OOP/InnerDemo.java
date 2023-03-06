package OOP;

class Outer{
    int num;
    void outerdisplay(){
        System.out.println("Outer display");
    }

    class Inner{
        int x;
        void innerdisplay(){
            System.out.println("Inner display");
        }
    }
}
public class InnerDemo {
    public static void main(String[] args) {
    Outer o =new Outer();
    o.num =1;
    //Inner i = new Inner();// its wrong becoz inner is inside of outer. so we can call with the outer class object
    Outer.Inner i=o.new Inner();
    i.innerdisplay();
    o.outerdisplay();

    }
}
