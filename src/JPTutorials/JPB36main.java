package JPTutorials;

public class JPB36main {
    public static void main(String[] args) {
        JPB36 jpbObject = new JPB36();
        System.out.println(jpbObject.toMilitary());
        jpbObject.setTime(13,27,6);
        System.out.println(jpbObject.toMilitary());

        System.out.println(jpbObject.toString());

        jpbObject.setTime(13, 26, 6);
        System.out.println(jpbObject.toMilitary());
        System.out.println(jpbObject.toString());
    }


    }

