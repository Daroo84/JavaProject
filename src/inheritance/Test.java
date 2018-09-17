package inheritance;

public class Test {
    public static void main(String[] args) {
        Punkt2D pkt2D = new Punkt2D(3, 3);
        System.out.println("Coordinates: " + pkt2D.x +" "+pkt2D.y);

        Punkt3D pkt3D = new Punkt3D(5, 5,5);
        System.out.println("Coordinates: " + pkt3D.x +" "+pkt3D.y+" "+pkt3D.z);
    }
}
