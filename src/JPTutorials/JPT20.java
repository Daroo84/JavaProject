package JPTutorials;

public class JPT20 {
    public static void main(String[] args) {
        int multTable[][] = {{1,2,3,4,5,6}, {2,4,6}, {3,6,9}};

        for (int i = 0; i < multTable.length; i++) {
            for (int j = 0; j < multTable[i].length; j++) {
                System.out.print(multTable[i][j]);
            }
            System.out.println();
        }
    }
}
