package collections.iteration;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Fast remove items from LinkedList using Iterator
 */
public class DeleteFromLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = getRandomList();
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            int next = iterator.next();
            if (next >= 128) {
                iterator.remove();
            }
        }
        // or faster method remove - removeIf(...)
        // linkedList.removeIf(next -> next >= 128);
    }

    /**
     * Generating int values and add to LinkedList
     * @return filled LinkedList
     */
    private static LinkedList<Integer> getRandomList() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            list.add((int) Math.round(Math.random() * 256));
        }
        return list;
    }

}
