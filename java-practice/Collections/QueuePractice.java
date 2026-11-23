import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); // LinkedList is used here because it implements the Queue interface and allows for efficient insertion and removal of elements in a FIFO (First In, First Out) manner.

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("Queue elements: " + queue);

        int removedElement = queue.remove(); // removes the head of the queue
        System.out.println("Removed element: " + removedElement);
        System.out.println("Queue after removal: " + queue);

        int headElement = queue.peek(); // retrieves, but does not remove, the head of the queue
        System.out.println("Head element: " + headElement);
    }
}
