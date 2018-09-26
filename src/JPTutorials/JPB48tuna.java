package JPTutorials;

public class JPB48tuna {

    private int sum;
    private  final int NUMBER;


    public JPB48tuna(int x){
        NUMBER = x;
    }
    public void add(){
        sum+=NUMBER;

    }
    public String toString(){
        return String.format("sum = %d\n", sum);
    }
}
