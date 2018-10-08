package tasks.sam.prog;

public class Arrays {

    public static String[] get5FirstElements(String[] array) {
        String[] newArray = new String[5];
        for (int i=0; i<5; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }
    public static int[] reverseArray(int[]array){
        int[] newArray = new int[array.length];
        int count = array.length -1;
        for (int i = 0; i < array.length;i++){
            newArray[count] = array[i];
            count--;
        }
        return newArray;

    }

    public static void main(String[] args) {
        String[] alphabetArray ={"A", "B","C","D","E","F"};
        int array[] ={1, 2, 3};

        System.out.println("Original array" + Arrays.toString(alphabetArray));
        System.out.println("New array " + Arrays.toString(get5FirstElements(alphabetArray)));

        System.out.println("Reversed array " + Arrays.toString(reverseArray(array)));

    }


}
