public class Down extends Top {

    static void myTop() {
        System.out.println("Testing myTop method in Down class");
    }
    public static void main(String [] args) {
        Top t = new Down();
        t.myTop();
    }
}
