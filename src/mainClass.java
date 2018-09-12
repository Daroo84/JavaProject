import java.util.Scanner;

public class mainClass {

    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);


        player p1 = new player();
        player bob = new player();
        player joe = new player();

        p1.power = 4;
        bob.power = 67;
        joe.power = 33;

        System.out.println("P1 set your name: ");
        String p1Name = myScan.nextLine();
        p1.setName(p1Name);

        System.out.println(p1.getName() + " change your power level. It is now lowly " +p1.getPower());
        int p1NewPower = myScan.nextInt();
        p1.setPower(p1NewPower);

        System.out.println("It is now a " +p1.getPower());
    }
}
