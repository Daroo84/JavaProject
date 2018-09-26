package JPTutorials;

public class JPB61app {
    public static void main(String[] args) {
        JPB61animal[] thelist = new JPB61animal[2];
        JPB61dog d = new JPB61dog();
        JPB61fish f = new JPB61fish();

        thelist[0]=d;
        thelist[1]=f;


        for (JPB61animal x: thelist){
            x.noise();
        }
    }
}
