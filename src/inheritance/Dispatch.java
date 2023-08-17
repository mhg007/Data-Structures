package inheritance;

class As{
    void callme(){
        System.out.println("A's : callme");
    }
}
class Bs extends As{
    void callme(){
        System.out.println("B's : callme");
    }
}

class Cs extends As{
    void callme(){
        System.out.println("C's : callme");
    }
}
public class Dispatch {
    public static void main(String[] args) {
        As a = new As();
        Bs b = new Bs();
        Cs c = new Cs();

        As r;
        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();

        As d = new Cs();
        d.callme();
    }
}
