package inheritance;

abstract class Figure{
    double dim1,dim2;
    Figure(double dim1,double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    abstract double area();
}

class Rectangle extends Figure{
    Rectangle(double a,double b){
        super(a,b);
    }
    double area(){
        System.out.println("inside Rectangle class");
        return dim1*dim2;
    }
}

class Triangle extends Figure{
    Triangle(double a,double b){
        super(a,b);
    }
    double area(){
        System.out.println("Inside Triangle Class");
        return dim1*dim2 / 2;
    }
}
public class FindArea {
    public static void main(String[] args) {
//        Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);

        Figure figF;
        figF = r;
        System.out.println(figF.area());

        figF = t;
        System.out.println(figF.area());

//        figF = f;
//        System.out.println(figF.area());
    }
}
