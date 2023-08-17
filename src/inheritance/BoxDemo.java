package inheritance;

public class BoxDemo {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10.0,15,20,34.3);
        BoxWeight mybox2 = new BoxWeight(2,3,4,1.5);
        BoxWeight mybox3 = new BoxWeight();
        var mycube = new BoxWeight(3,2);
        var myclone = new BoxWeight(mybox1);

        System.out.println("Box 1 Volume: "+mybox1.volume());
        System.out.println("Box 1 Weight: "+mybox1.weight);

        System.out.println("Box 2 Volume: "+mybox2.volume());
        System.out.println("Box 2 Weight: "+mybox2.weight);

        System.out.println("Box 3 Volume: "+mybox3.volume());
        System.out.println("Box 3 Weight: "+mybox3.weight);

        System.out.println("Clone Volume: "+myclone.volume());
        System.out.println("Clone Weight: "+myclone.weight);

        System.out.println("Cube Volume: "+mycube.volume());
        System.out.println("Cube Weight: "+mycube.weight);

        // Shipment
        var shipment1 = new Shipment(10,15,20,30.5,50);
        var shipment2 = new Shipment(2,3,4,1.5,2.5);

        System.out.println("Shipment 1 Volume: "+shipment1.volume());
        System.out.println("Shipment 1 Weight: "+shipment1.weight);
        System.out.println("Shipment 1 Cost: "+shipment1.cost);

    }
}

