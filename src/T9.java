import java.util.Scanner;

public class T9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter command: ");
        String text = input.nextLine();

        switch (text) {

            case "start":
                System.out.println("Machine started!");
                break;
            case "stop":
                System.out.println("Machine sttoped");
                break;

            default:
                System.out.println("Command not recognized");

        }

    }

}
