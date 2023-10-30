package Queue;

import java.util.Arrays;
import java.util.Stack;

public class ArrayQueue {
    private int[] items;
    private int front=0;
    private int rear=0;
    public ArrayQueue(int capacity){
        items = new int[capacity];
    }
    public void enqueue(int item){
        if(isFull())
            throw new IllegalStateException();
        items[rear] = item;
        rear = (rear+1)%items.length;
    }
    public int dequeue(){
        var item = items[front];
        items[front] = 0;
        front = (front+1)%items.length;
        return item;
    }
    public int peek(){
        return items[rear-1];
    }
    public boolean isEmpty(){
        return rear==0;
    }
    public boolean isFull(){
        return rear == items.length;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }

}
