package JPTutorials;

import java.io.IOException;

public class mainClassExepHandling {
    public static void main(String[] args) {
        int x, y;

        try {

            x = (Integer) null;
            y = (Integer) null;

            System.out.println("Product: " + x * y);
        } catch (Error e) {
            System.out.println("Error");
        } finally {
            System.out.println("Finally here");

        }
    }

    public static void printString(String s) throws NullPointerException {
        System.out.println(s);
    }
}
