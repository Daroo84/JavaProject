
class Person {
    String name;
    int age;

    void speak(){
        for(int i= 0; i< 3; i++) {
            System.out.println("My name is: " + name + " and I am " + age + "yers old");
        }
    }
    void sayHello(){
            System.out.println("hello there");

        }
}



public class T14 {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Jo Po";
        person1.age = 37;
        person1.speak();
        person1.sayHello();


        Person person2 = new Person();
        person2.name = "Bad Tat";
        person2.age = 11;
        person1.sayHello();

        System.out.println(person1.name);

    }


}
