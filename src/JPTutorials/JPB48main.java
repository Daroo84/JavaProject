package JPTutorials;

public class JPB48main {
    public static void main(String[] args) {
        JPB48tuna tunaObject = new JPB48tuna(10);

        for (int i = 0; i<5;i++){
            tunaObject.add();
            System.out.printf("%s", tunaObject);
        }
    }

}
