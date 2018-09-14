package JPTutorials;

public class mainClassInt {
    public static void main(String[] args) {
        Apple a = new Apple();

        System.out.println("I am an " + a.getName() + ". I am " + a.getTexture() + " and have the color of " + a.getColor() + " and am a " + a.isCitrus() + "citrus");
    }
}
