package programmingTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        int tab[] = {1, 2, 3, 4, 5};
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int index = -1;

        System.out.println("Enter table index: ");
        

/*
        try {
            System.out.println(tab[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong  value, table dimension is: " + tab.length);

*/

        boolean ifCorrect;
        while(!ifCorrect) {
            try {
                index = Integer.parseInt(read.readLine());
            } catch (NumberFormatException n) {
                System.out.println("Wrong data!" + "Which element do you want to see:");
            } catch (IOException e) {
                System.out.println("Read data error");
            }
            ifCorrect = index == -1 ? false : true;
        }
        try {
            System.out.println(tab[index - 1]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Wrong parameter, table dimension is" +tab.length);
        }


    }
}
