package programmingTask;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        int temp;
        Scanner MyScan = new Scanner(System.in);
        temp = MyScan.nextInt();
        pomiar(temp);
    }
    static void  pomiar(int temp){
        if(temp>0){
            System.out.println("Temp dodatnia");
        }
        else {
            System.out.println("Temp ujemna");
        }

    }
}
