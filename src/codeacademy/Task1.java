package codeacademy;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = scanner.next();
        System.out.println("Enter surname: ");
        String surname = scanner.next();

        System.out.println("Your name and surname are: " + name + " " + surname);
    }

}
