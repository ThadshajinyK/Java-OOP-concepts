package OOP;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(3);
        q.add(4);
        q.add(2);
        q.add(8);
        q.add(11);

        System.out.println("Head is "+q.peek());
        System.out.println("Removed " + q.remove());// remove the first element and print what removed
        System.out.println("now head is "+q.peek());
        System.out.println("Removed "+q.poll());
        System.out.println("Removed "+q.poll());
        System.out.println("Removed "+q.poll());
        System.out.println("Removed "+q.poll());
        System.out.println("Removed "+q.poll()); // if list is empty poll() display as null.
        //System.out.println("Removed "+q.remove()); //but peek() will throw an exception
        System.out.println("Removed "+q.poll());
    }
}
