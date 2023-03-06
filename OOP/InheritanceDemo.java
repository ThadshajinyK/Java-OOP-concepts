package OOP;

class Employee{ //base class, super class, parent class
    private String name;
    private double salary;

    Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    Employee(){
        name = " ";
        salary =0.0;
    }

    String getName(){return this.name;}
    void setName(String name){this.name=name;}
    double getSalary(){return this.salary;}
    void setSalary(double salary){this.salary=salary;}

    void raiseSalary(double percentage){
        this.salary+=this.salary*percentage/100; //10000*20/100=2000  , 2000+10000=12000 ,
    }



}

class Manager extends Employee{ //derived class, sub class, parent class
    double bonus;

    Manager(String name,double salary,double bonus){
       //this.salary=salary; // won't work , bcoz private salary in super class
        super(name,salary);
        this.bonus=bonus;
         // super = base class constructer
       // this.name=name;//won't work , bcoz private name in super class
    }

    void setBonus(double bonus)
    {
        this.bonus=bonus;
    }

    public double getSalary(){ //overriding
        return super.getSalary()+bonus;
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
    Employee e1 =new Employee("Ram",20000);
    e1.raiseSalary(10);
        System.out.println(e1.getSalary());


        Manager m1 = new Manager("John",65000,0.0);
        m1.setBonus(20000);
        System.out.println(m1.getSalary()); // it will show 65000, not adding 20000 bonus
        // bcoz getSalary function is not accessed the bonus in its sub class
        // but after overide the getSalary in sub class it will work.
Employee e2 = new Manager("Ramya",68000,0); // polymorphism

Employee[] employees=new Employee[2];
employees[0] = new Employee("ram",30000);
employees[1] = new Manager("sri",58000,0);

employees[0].getName();
employees[1].getSalary();
employees[1].getName();
//employees[1].setBonus();//not allowed as it is an employee object array
    Manager m2=(Manager) employees[1];
        m2.setBonus(2000);
        System.out.println(m2.getSalary());


for(Employee e:employees)
{           //dynamic binding : call relevant overide function for m1.getsalary , that's why increased bonus is showed
    System.out.println(e.getName()+" " + e.getSalary());
}

    }
}
