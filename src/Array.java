import java.util.Arrays;

public class Array {
    private int[] items;
    private int count=0;
    public Array(int size){
        items = new int[size];
    }
    public void insert(int x){
        if(count == items.length){
            int[] newArr = new int[count*2];
            for(int i=0;i<count;i++){
                newArr[i] = items[i];
            }
            items = newArr;
        }
        items[count++] = x;
    }
    public void removeAt(int index){
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
        // [10,20,30,40] -> [10,0,30,40]
        for(int i=index;i<count-1;i++){
            items[i] = items[i+1];
        }
        count--;
    }
    public int indexOf(int x) throws Exception{
        if(items.length == 0)
            throw new Exception("Array is Empty");
        else{
            for(int i=0;i<count;i++){
                if(items[i] == x)
                    return i;
            }
            return -1;
        }
    }
    public void print(){
        for(int i=0;i<count;i++){
            System.out.println(items[i]);
        }
    }
    public int max(){
        int largest = -1;
        for(int i=0;i<count-1;i++){
            if(items[i] > largest)
                largest = items[i];

        }
        return largest;
    }
    public void reverse(){
        int[] newArr = new int[count];
        int index=0;
        for(int i=count-1;i>-1;i--){
            newArr[index++] = items[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
    public void insertAt(int item,int index){
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();
        
        for(int i=count-1;i>=index;i--)
            items[i+1] = items[i];
        items[index] = item;
        count++;
    }
}
