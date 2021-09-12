import java.util.Random;

public class Die extends Die_Runner{
    public static int[] dieNormal = {1,2,3,4,5,6};
    public static int roll() {
        int rnd = new Random().nextInt(dieNormal.length);
        return dieNormal[rnd];
    }
}
