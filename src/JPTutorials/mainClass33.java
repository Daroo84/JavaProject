package JPTutorials;

public class mainClass33 {

    public static void main(String[] args) {
        Animal cow = new Cow();
        Animal goat = new Goat();

        Animal[] animals = {cow, goat};

        for(Animal a: animals) {
            a.displayName();

        }





   /*
        Animal anim = new Animal();
        Cow cow = new Cow();
        Goat goat = new Goat();





        goat.setName();
        goat.displayName();
        goat.walk();
        goat.status();
*/
    }
}
