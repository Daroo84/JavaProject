package codeacademy;

public class FactorialwithMethod {

    static int factorial(int n){

        int score = 1;
        for ( int i=1;i<=n;i++){
            score*=1;
        }
        return score;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
