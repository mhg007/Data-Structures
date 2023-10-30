package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueDemo {
    public static void main(String[] args) {
        /* // Reverse Queue
        Queue<Integer> q = new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        reverseQueue(q);
        System.out.println(q);

        // Queue using Array
        var queue = new ArrayQueue(5);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(20);
        queue.enqueue(25);
        queue.enqueue(30);
        System.out.println(queue);
         */
        var queue = new PriorityQueues(5);
        queue.insert(30);
        queue.insert(10);
        queue.insert(20);
        queue.insert(25);
        queue.insert(5);
        System.out.println(queue);
        while (!queue.isEmpty())
            System.out.println(queue.remove());
    }
    // Reversing a Queue
    public static void reverseQueue(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }
}
