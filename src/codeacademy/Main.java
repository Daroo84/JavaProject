package codeacademy;

import javax.swing.*;

public class Main {

    int sum(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int add(int a, int b, int c){
        int sum = a + b + c;
        return sum;

    }
    static int substract(int a, int b){
        int score1 = a - b;
        return score1;
    }

    public static void main(String[] args) {

        //without static
        Main main = new Main();
        System.out.println(main.sum(5,8));
        System.out.println(multiply(9,7));

        int score = (multiply(10,9));
        System.out.println(score);
        System.out.println(add(5,5,5));

        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter first number: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second no.: "));
        int score1 = substract(a,b);
        JOptionPane.showMessageDialog(null, "Substract is: " +score1);

    }
}
