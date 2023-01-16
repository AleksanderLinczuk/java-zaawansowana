package collections;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Tomek1");
        queue.add("Kamil1");
        queue.offer("Tomek2");
        queue.offer("Kamil2");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());


    }
}
