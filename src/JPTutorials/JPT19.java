package JPTutorials;

public class JPT19 {

    public static void main(String[] args) {

        int testScores[] = {99, 97, 89, 95, 100};
        int sum = 0;

        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[1];
        }
        int average = sum / testScores.length;
        System.out.println("The avg of test score is " + average);

    }
}
