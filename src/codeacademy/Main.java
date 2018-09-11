package codeacademy;

public class Main {

    int sum(int a, int b){
        return a+b;
    }
    static int multiply(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {

        //without static
        Main main = new Main();
        System.out.println(main.sum(5,8));
        System.out.println(multiply(9,7));

        int score = (multiply(10,9));
        System.out.println(score);

    }
}
