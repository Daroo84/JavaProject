package JPTutorials;

public class JPT29 {
    public static void main(String[] args) {
        System.out.println(average(1, 2, 5));


    }
    public static int average(int ... numbers){
        int sum = 0;
        int average = 0;

        for(int i: numbers) {
            sum += i;
        }

        average = sum / numbers.length;
        return average;
    }

}
