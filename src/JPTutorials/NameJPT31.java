package JPTutorials;

public class NameJPT31 {

    private String first;
    private String middle;
    private String last;

    public NameJPT31(String first, String middle, String last) {
        this.first = first;
        this.middle = middle;
        this.last = last;

        System.out.println("The full name " + this);

    }

    public String toString() {
        return new String(first + "" + middle + "" + last);
    }


}
