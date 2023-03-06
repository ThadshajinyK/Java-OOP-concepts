package OOP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionDemo {
    public static void main(String[] args) {
       // int a[]= new int[5]; // array is fixed in size
/**
 * Integer array list
 */
        ArrayList<Integer> alist = new ArrayList<Integer>();// flexible in size
        alist.add(100);
        alist.add(20);
        alist.add(30);
        alist.add(40);
        alist.add(50);

        alist.set(0,10);
        alist.remove(4);

        System.out.println(alist);
/**
* String arraylist
*/

        ArrayList<String> sList = new ArrayList<String>();
        sList.add("John");
        sList.add("Vino");
        sList.add("kishanth");

        System.out.println(sList);

/**
* object array
*/

        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("john",20000));
        employeeList.add(new Employee("Kamal",60000));
        employeeList.add(new Employee("Ram",3000));
        employeeList.add(new Manager("kathir",15000,5200));

        for (Employee em: employeeList)
        {
            System.out.println(em.getName());
/**
 * Iterator
 */
            Iterator<Integer> i = alist.iterator();
            System.out.println("using iterator");
            System.out.println(i.next());
            System.out.println(i.next());

        }

/**
* Liked list
*/

        LinkedList<String> Li = new LinkedList<String>();
      // practice code

    }
}
