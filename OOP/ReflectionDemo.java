package OOP;
import java.lang.reflect.*; // Java reflection

public class ReflectionDemo {
    public static void main(String[] args) {
        Employee e=new Employee("Diya",60000);

        Class cls = e.getClass();
        System.out.println("Class name is: "+e.getClass());

        Method[] methods = cls.getMethods();
        for(Method m:methods){
            System.out.println(m.getName());
        }
    }
}
