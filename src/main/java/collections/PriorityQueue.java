package collections;

import java.util.Queue;

/**
 * PriorityQueue is sorted Queue.
 * PriorityQueue sorting everytime on poll() item.
 */
public class PriorityQueue {

    public static void main(String[] args) {
        Queue queue = new java.util.PriorityQueue();
        queue.add("1");
        queue.add("4");
        queue.add("2");
        queue.add("3");

        // poll - with compare (see PriorityQueue poll method source)
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // it's without sorting, just to see items
//        Iterator iterator = queue.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }

}
