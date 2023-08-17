package inheritance;

public class Box{
    private double width,height,depth;
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box (double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    Box(){
        width = height = depth = -1;
    }
    Box(double len){
        width = height = depth = len;
    }
    double volume(){
        return depth*height* width;
    }
}