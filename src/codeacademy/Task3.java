package codeacademy;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("\"Mowa jest srebrem, a milczenie zlotem\"");

        // printing the last char in enterred word
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String word =scanner.next();
        int length = word.length();
        System.out.println(word.charAt(length-2r));

        //4 17
        //2*2 = 4
        //3*3 = 9
        //4*4 = 16
        int a = 4;
        int b = 24;

        int sccore = 0;

        int ceil = (int)Math.ceil(Math.sqrt(a));
        int floor = (int)Math.sqrt(b);

        System.out.println(floor-ceil+1);





    }
}
