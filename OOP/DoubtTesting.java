package OOP;

public class DoubtTesting {
    public static void main(String[] args) {
        Person p1=new Person();
        Student s1 = new Student();
        Teacher t1 = new Teacher();

        s1.admit();
        s1.dispplay();
        s1.study();
        t1.teach();
    }
}

class Person{
    void dispplay(){
        System.out.println("I am a person");
    }

    void admit(){
        System.out.println("OOP.Person is admitted.");
    }
}

class Teacher extends Person{
    void teach(){
        System.out.println("As I am a teacher , am teaching...");
    }
}

class Student extends Person{
    void study(){
        System.out.println("As I am a student, am studying...");
    }
}

interface some{
    void dispplay();
    void admit();
}



