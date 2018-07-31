import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter text");
        //Wait for the user to enter a line of text
        String line = input.nextLine();

        System.out.println("Enter a number");
        //Wait for the user to enter a number
        int value = input.nextInt();

        System.out.println("Enter a number");
        //Wait for the user to enter a number
        double value1 = input.nextDouble();




        System.out.println("you entered:" + line);
        System.out.println("you entered:" + value);
        System.out.println("you entered:" + value1);
    }
}
