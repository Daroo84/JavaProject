package tasks.sam.prog;

import jdk.internal.util.xml.impl.Input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodsTasks1 {
    public static void main(String[] args) {
        int no1 = 0;
        int no2 = 0;
        boolean wrongInput = true;

        Scanner input = new Scanner(System.in);

        while (wrongInput) {
            try {
                System.out.println("Enter 1st no: ");
                no1 = input.nextInt();
                System.out.println("Enter 2nd no: ");
                no2 = input.nextInt();
                wrongInput = false;
            } catch (InputMismatchException e) {
                System.out.println("You enterred wrong char");
            } finally {
                input.nextLine();
            }
        }
        calculateNumbers(no1, no2);
        isEven(no1);
        isEven(no2);
        isDivisible(no1);

        boolean checkNumber = isDivisible(no1);

        if (checkNumber) {
            System.out.println("Liczba " + no1 + " jest podzielna przez 3 i 5");
        } else {
            System.out.println("Number is not divisible by 3 i 5");

        }
        System.out.println("Liczba " + no1 + " to power three is " + toPowerThree(no1));
        System.out.println("Square from number " + no1 + " is " + calculateSquare(no1));

        System.out.println("Enter triangle dimensions: ");

        wrongInput = true;
        int a = 0;
        int b = 0;
        int c = 0;

        while (wrongInput){
            try {
                System.out.println("Enter 1st dimension: ");
                a = input.nextInt();
                System.out.println("Enter 2nd dimension: ");
                b = input.nextInt();
                System.out.println("Enter 3rd dimension: ");
                c = input.nextInt();
                wrongInput = false;
            } catch (InputMismatchException e){
                System.out.println("Wrong char. try again!");
            }finally {
                input.nextLine();
            }
        }
        input.close();

        if ((a < 1) || (b < 1) || (c<1)){
            throw new IllegalArgumentException("Nubmer should be greater than 0");
        }
        boolean checkIfTriangle = isTriangle(a, b, c);

        if (checkIfTriangle) {
            System.out.println("Triangle with dimension a= " + a + " b= " + b + " c= " + c );
        }else {
            System.out.println("Triangle with a, b, c dimensions is not rectangular");
        }

    }



    public static void calculateNumbers(int no1, int no2) {
        System.out.println(no1 + " + " + no2 + " = " + (no1 + no2));
    }

    public static boolean isDivisible(int no1) {
        if (no1 % 3 == 0 && no1 % 5 == 0) {

            return true;
        }
        return false;
    }

    public static boolean isEven(int no1) {
        if (no1 % 2 == 0) {
            System.out.println(+no1 + " Is even!");
            return true;

        } else {
            System.out.println(+no1 + " Is not even!");
            return false;
        }
    }

    public static int toPowerThree(int number) {
        int result = number * number * number;
        return result;
    }


    public static double calculateSquare(double number) {
        double result = Math.sqrt(number);
        return result;

    }
    public static boolean isTriangle(int a, int b, int c) {
        int longDim;
        int shortDim1;
        int shortDim2;
        if (a > b && a > c){
            longDim = a;
            shortDim1 = b;
            shortDim2 = c;
        } else if (b > c && b > a){
            longDim = b;
            shortDim1 = c;
            shortDim2 = a;

        }else {
            longDim = c;
            shortDim1 = a;
            shortDim2 = b;
        }
        return (shortDim1 * shortDim1) + (shortDim2 * shortDim2) == (longDim * longDim);

    }
}



