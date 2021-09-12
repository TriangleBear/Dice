import java.util.Random;
import java.util.Scanner;
public class Die_Runner {
    public static Scanner sc = new Scanner(System.in);
    public static int[] dieNormal = {1,2,3,4,5,6};
    public static int roll(){
        int rnd = new Random().nextInt(dieNormal.length);
        return dieNormal[rnd];
    }
    public static void main(String[] args) {
        int choice;
        while(true){
            System.out.print("""
                    What do you what to do?
                    1. Normal Die
                    2. Create Custom Die
                    3. Add a Face in Custom Die
                    4. Remove a Face in Custom Die
                    5. Create Unfair Die
                    6. Create Unfair with Custom Die
                    7. Use Unfair Die
                    8. exit
                    choose:\s""");
            choice=sc.nextInt();
            System.out.println();
            switch (choice){
                case 1 -> System.out.println("You got "+roll()+" in the Die\n");
                case 2 -> CustomDie.customFace();
                case 3 -> CustomDie.addFace();
                case 4 -> CustomDie.removeFace();
                case 5 -> System.out.println("Not");
                case 6 -> System.out.println("Yet");
                case 7 -> System.out.println("Finished");
                case 8 -> System.exit(0);
                default -> main(null);
            }
        }
    }
}
