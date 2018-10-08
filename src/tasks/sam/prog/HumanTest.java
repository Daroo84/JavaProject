package tasks.sam.prog;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human(44, 66, 177, "Raf", "Male");
        System.out.println(human.toString());
        human.isMale(human.getSex());

    }
}
