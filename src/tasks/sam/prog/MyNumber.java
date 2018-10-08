package tasks.sam.prog;

public class MyNumber {
    private double number;

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
    public boolean isOdd(){
        if (number % 2 != 0){
            System.out.println("Number " + number + "is not even");
        }
        return true;
    }
    public boolean isEven(){
        if (number % 2 == 0) {
            System.out.println("Number " + number + "is even.");
        }
        return false;
    }
    public double sqrt(){
        double result = Math.sqrt(number);
        return result;
    }
    public double pow(MyNumber x){
        new MyNumber(x.number);
        double result = (number + x.number);
        return result;
    }
    public double subtract(MyNumber x){
        new MyNumber(x.number);
        double result = (number - x.number);
        return result;
    }
    @Override
    public String toString(){
        return "Number is "+getNumber();
    }

}
