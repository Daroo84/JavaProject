package tasks.sam.prog;

public class MyNumberTest {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(2);

        System.out.println(myNumber.toString());
        myNumber.isEven();
        myNumber.isOdd();
        System.out.println("Pow: " + myNumber.pow(myNumber));
        System.out.println("Sqrt :" + myNumber.sqrt());
        System.out.println("Substract: " +myNumber.subtract(myNumber));
    }
}
