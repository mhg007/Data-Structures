package Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateLeft {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        var rot = rotLeft(list,4);
        System.out.println(Arrays.toString(rot.toArray()));
    }
    public static List<Integer> rotLeft(List<Integer> a, int d){
        int temp;
        int index = a.size()-1;
        while(d>=0){
            if(index <= 0){
                index = a.size()-1;
            }
            temp = a.get(index);
            a.add(index-1,temp);
            a.remove(index);
            d--;
            index--;
        }
        return a;
    }
}
