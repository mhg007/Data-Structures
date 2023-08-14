import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        System.out.println(list.size());
        list.addLast(10);
        System.out.println(list.size());
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        System.out.println(list.size());
//        list.removeFirst();
//        list.removeLast();
//        System.out.println(list.size());
        list.reserve();
        var arr = list.toArray();
        System.out.println(Arrays.toString(arr));

        /*
        Array numbers = new Array(5);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.insert(50);
        try{
            System.out.println("IndexOf: "+numbers.indexOf(30));
        }
        catch(Exception e){
            System.out.println(e);
        }
        numbers.removeAt(0);
        numbers.print();
        System.out.println("Largest item: "+numbers.max());
        numbers.insertAt(35,3);
        numbers.reverse();
        numbers.print();
//        // Press Alt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }

         */
    }
}