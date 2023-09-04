package Queue;

import java.util.*;

public class InBuiltQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        List<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(101);
        arr.add(102);
        arr.add(103);

        queue.addAll(arr);
        queue2.add(100);
        queue2.add(101);
        queue2.add(103);
        queue2.add(102);
        System.out.println(queue.equals(queue2)); // return true if all elements is same in both queue and also at same position. else false.

        System.out.println(Arrays.toString(queue.toArray()));// convert queue into array.
        queue.add(5);   // add element
        queue.add(7);   // add element and throw an IllegalStateException if no space is currently available in the Queue.
        queue.offer(6); // add element and return false if the element cannot be inserted due to capacity restrictions.
        queue.poll(); // delete element and return null if queue is empty.
        queue.remove(); // delete element and throw exception if queue is empty.
        queue.remove(6); // delete given element if exists;
        System.out.println(queue);
        System.out.println("First element is: " + queue.peek()); // Return First element and return null if  queue is empty.
        System.out.println(queue.element());//Return First element and throws NoSuchElementException while queue is empty.
        System.out.println("Size is : " + queue.size()); // Return size


        queue.addAll(arr);   //add all elements
        System.out.println(queue);
        queue.clear();      // removes all elements of queue at same time.
        queue.removeAll(arr); // removes all elements of arr from queue.
        System.out.println(queue);
        System.out.println(queue.contains(101)); // return true if element exists in queue else return false;
        queue.remove();
        System.out.println(queue.containsAll(arr));// check for all emenets contains or not.
        System.out.println(queue.isEmpty()); // return boolean queue is empty or not.
    }
}
