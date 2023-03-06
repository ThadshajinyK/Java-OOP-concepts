package OOP;

public class ClassDemo {

   static int boxVolume(int length, int breadth, int height){
        int volume = length*breadth*height;
        return volume;
    }
    public static void main(String[] args) {
        System.out.println("main starts here..");
        System.out.println("before creating box obj");
        Box blackbox=new Box(5,4,10);

        System.out.println("after creating black box..");
        System.out.println("blackbox breadth is " +blackbox.breadth);

        int vol=boxVolume(10,4,2); //passing arguments
        System.out.println("volume ="+vol);
        System.out.println("the colume of blackbox is" + blackbox.volume());

        Box b1=new Box(5,4,10);
        System.out.println(blackbox.isEqual(b1)); // object passing

        Box b2=new Box(b1);
        System.out.println("b2 l,b,h = "+b2.length + " " +b2.breadth+" "+b2.height);
        System.out.println("b1 l,b,h = "+b1.length + " " +b1.breadth+" "+b1.height);


        Box b3 = b1.doubleBox();
        System.out.println("b3 l,b,h = "+b3.length + " " +b3.breadth+" "+b3.height);

        Box.displayBoxCount();

    }
}

class Box{
    int length;
    int breadth;
    int height;
    static int boxCount;

    Box(int l,int b,int h){
        this.length=l;
         this.breadth=b;
         this.height=h;
         boxCount++;
    }
    Box(Box b){
        this.length=b.length;
        this.height=b.height;
        this.breadth=b.breadth;
        boxCount++;
    }

    static{ // it will execute just before creating the object of the class
        System.out.println("static ........");
        boxCount =0;
    }

    static void displayBoxCount(){
        System.out.println("total box objects created : " + boxCount);
       // length=90; // this is a non-static variable. can't access within static method.
        // only static variables can be accessed through static methods.
        /* non-static variable length cannot be referenced from a static context */
    }

    Box doubleBox(){
        Box temp=new Box(2*this.length,2*this.breadth,2*this.height);
        return temp;
    }

    int volume (){
        return breadth*height*length;
    }

    boolean isEqual(Box b) // getting an object as argument
    {
        if((this.length==b.length)&&(this.height==b.height)&&(this.breadth==b.breadth))
            return true;
        else
            return false;
    }



}
