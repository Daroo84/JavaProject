package JPTutorials;

public class Ex1 {
    public static void main(String[] args) {

        double salary = 1000;
        double tax = 0.0;

        if(salary <= 900){
            tax = salary * .10;
        }else if(salary<=2500){
            tax = salary * .20;
        }else{
            tax = salary * .30;
        }
        System.out.println("Tax = " + tax);

    }

}
