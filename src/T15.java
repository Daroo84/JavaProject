class Personn{

    String name;
    int age;

    void speak(){

        System.out.println("My name is: " + name);
    }

    int calculateYearsToRetirement(){
        int yearsLeft = 65 - age;

        return yearsLeft;
    }
}



public class T15 {

    public static void main(String[] args) {
        Personn person1 = new Personn();

        person1.name = "Joe";
        person1.age = 33;

        int years = person1.calculateYearsToRetirement();

        System.out.println("Years till retirements " + years);

    }
}
