public class T6_1 {

    public static void main(String[] args) {

        int loop = 0;

        while (true) {
            System.out.println("Looping:" + loop);

            if(loop == 5) {
                break;
            }
            loop++;

            System.out.println("Running");
        }
    }
}
