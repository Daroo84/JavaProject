package programmingTask;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.name= "Mirek";
        employee1.surname= "Tok";
        employee1.old = 44;

        System.out.println(employee1.name+ " "+employee1.surname+ " "+employee1.old);
    }
}
