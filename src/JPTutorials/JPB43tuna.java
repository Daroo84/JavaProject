package JPTutorials;

public class JPB43tuna {
    private String name;
    private JPB42potpie birthday;

    public JPB43tuna (String theName, JPB42potpie theDate) {
        name = theName;
        birthday = theDate;

    }
    public String toString() {
        return String.format("My name is %s, my birthday is %s", name, birthday);
    }
}
