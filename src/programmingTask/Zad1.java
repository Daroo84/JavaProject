package programmingTask;

public class Zad1 {
    public static void main(String[] args) {


        String pogoda = "Pochmurnie i pada deszcz";
        String pogoda1 = "Przelotne opady deszczu";
        String pogoda2 = "Snieg";

        int length = pogoda.length() + pogoda1.length() + pogoda2.length();

        System.out.println(pogoda);
        System.out.println(pogoda1);
        System.out.println(pogoda2);
        System.out.println(pogoda.length() + pogoda1.length() + pogoda2.length());
        System.out.println("Suma znakow = " + length);

    }
}
