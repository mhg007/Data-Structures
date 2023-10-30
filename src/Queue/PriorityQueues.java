package Queue;

import java.util.Arrays;

public class PriorityQueues {
    private int[] items;
    int count = 0;
    public PriorityQueues(int capacity){
        items = new int[capacity];
    }
    public void insert(int item){
        if(isFull())
            throw new IllegalStateException();
        int i=shiftItemsToInsert(item);
        items[i+1] = item;
        count++;

    }
    public boolean isFull(){
        return count == items.length;
    }
    public int shiftItemsToInsert(int item){
        int i=0;
        for(i=count-1;i>-1;i--){
            if(items[i] > item)
                items[i+1] = items[i];
            else
                break;
        }
        return i+1;
    }
    public int remove(){
        if(isEmpty())
            throw new IllegalStateException();
        return items[--count];
    }
    public boolean isEmpty(){
        return count==0;
    }
    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}
