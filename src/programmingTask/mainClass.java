package programmingTask;

public class mainClass {
    public static void main(String[] args) {
        somethingRandom sr = new somethingRandom();
        somethingRandom x = new somethingRandom();

        sr.name = "Bob";
        sr.x = 5;

        x.name = "John";
        x.x = 4;


        System.out.println(sr.name + sr.x);
        System.out.println(x.name + x.x);
    }



}
