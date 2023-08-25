package inheritance;

public class AbstractDemo {
    public static void main(String[] args) {
        var b = new BDemo();
        b.callme();
        b.callmetoo();
    }
}
abstract class ADemo{
    abstract void callme();

    void callmetoo(){
        System.out.println("This is a concrete method");
    }
}
class BDemo extends ADemo{
    void callme(){
        System.out.println("BDemo's implementation of callme.");
    }
}
