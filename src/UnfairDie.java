import java.util.Random;
import java.util.Scanner;
public class UnfairDie extends CustomDie {
    public static int rn;
    public static void Equal_CD(){
        if(CustomDie.nF != null){
            int rnd = new Random().nextInt(CustomDie.nF.length);
            System.out.println(nF[rnd-1]);
        }else{
            System.out.println("The Die has Empty Faces");
            Die_Runner.main(null);
        }
        Die_Runner.main(null);
    }
    public static void Custom_CD(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Probability for all faces: ");
        rn = sc.nextInt();
        if((CustomDie.nF != null)&&(rn<=0)){
            int rnd = new Random(rn).nextInt(CustomDie.nF.length);
            System.out.println(nF[rnd-1]);
        }else{
            System.out.println("The Die has Empty Faces");
            Die_Runner.main(null);
        }
        Die_Runner.main(null);
    }
}