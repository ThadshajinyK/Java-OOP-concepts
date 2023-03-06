package OOP;
abstract class Member{
    private String name;
    abstract void welcomeMsg(); // abstract method

    public String getName(){ // concrete method
        return name;
    }

    } // end of absract class Member

class Student1 extends Member{
    void welcomeMsg(){
        System.out.println("Hello Student...");
    }
}

class Teacher1 extends Member{
    void welcomeMsg(){
        System.out.println("Hello Teacher...");
    }
}





public class AbstractDemo {
    public static void main(String[] args) {
    Student1 s1 = new Student1();
    Teacher1 t1 = new Teacher1();
   // Member m1=  new Member(); //Member is abstract; cannot be instantiated
      Member m1 = new Student1(); // it is possible
      Member m2 = new Teacher1();

      Member[] m = new Member[4];
            m[0] = new Student1();
            m[1] = new Teacher1(); // teacher object
            m[2] = new Student1();
            m[3] = new Student1();// student object

        for(Member mem:m){
            mem.welcomeMsg();
        }
    }
}

/* more example
create a shape class as abstract
    create findArea abstract method
create trinagle and square as subclass
implement the findArea method in subclasses

 */
