package codeacademy;

import java.util.Scanner;

public class Names {

    static boolean isNameFemale(String name) {
        if (name.endsWith("a")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String word = scanner.next();
        if (isNameFemale(word)){
            System.out.println("Name is female");
        }
        else {
            System.out.println("Name is male");
        }
    }
}



