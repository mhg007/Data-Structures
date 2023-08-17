package inheritance;

class A{
    A(){
        System.out.println("Class A");
    }
    void show(){
        System.out.println("I am Ironman!");
    }
}
class B extends A{
    B(){
        System.out.println("Class B");
    }
    void show(){
        super.show();
        System.out.println("I am Superman!");
    }
}
class C extends B{
    C(){
        System.out.println("Class C");
    }
    void show(){
        super.show();
        System.out.println("I am Groot!");
    }
}
public class ConstructorsDemo {
    public static void main(String[] args) {
        C c = new C();
        c.show();
        B b = new B();
        b.show();
        b=c;
        b.show();

    }
}
