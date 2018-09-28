package tasks.sam.prog;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodsTasks {

    public static void main(String[] args) {
        String name = getName();
        int age = getAge();

        System.out.println("Hej " + name + "!!!");
        System.out.println("Twoj wiek: " + age);
    }
    Scanner input = new Scanner(System.in);

    int no1 = 0;
    int no2 = 0;
    boolean wInput = true;
/*
    while (wInput) {
        try {
            System.out.println("Enter first number: ");
            no1 = input.nextInt();
            System.out.println("Enter second number: ");
            no2 = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You enterred unallowable char");
        } finally {
            input.nextInt();
        }

    }


    public static void calculateNumbers(int no1, no2){


    }
*/
    public static int getAge() {

        Scanner sc = new Scanner(System.in);
        Date date = new Date();


        int yourAge;
        int currentYear = 0;
        int birthyear = 0;

        boolean wrongInput = true;

        while (wrongInput) {
            try{
                System.out.println("Enter your age: ");
                birthyear = sc.nextInt();
                wrongInput = false;
            }catch (InputMismatchException e) {
                System.out.println("You enterred unallowable sign. Try again");
            }finally {
                sc.nextInt();
            }
        }
        currentYear = date.getYear() + 1900;

        yourAge = currentYear - birthyear;


        return yourAge;
    }

    private static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String name = scanner.nextLine();
        return name;
    }
}
