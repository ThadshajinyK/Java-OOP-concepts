package OOP;

public class ObjectClassDemo {
    public static void main(String[] args) {
        String s1 = "Java"; // not an object
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println(s1.equals(s2)); // objectkulla irukira content equala endu paakum
        System.out.println(s3.equals(s4));
        System.out.println(s1==s2);
        System.out.println(s4==s3); // rendume same objectaa? rendume same ref aa? endu tha check pannum.


    }
}
