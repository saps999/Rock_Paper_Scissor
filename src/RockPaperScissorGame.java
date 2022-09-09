import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for ROCK, 1 for PAPER & 2 for SCISSOR.");
        int a = sc.nextInt();
        if (a <= 2 && a >= 0) {

            if (a==0){
                System.out.println("You choose ROCK.");
            } else if (a==1) {
                System.out.println("You choose PAPER.");
            } else System.out.println("You choose SCISSOR.");

            Random r = new Random();
            int computerInput = r.nextInt(3);

            if (computerInput==0){
                System.out.println("Computer choose ROCK.");
            } else if (computerInput==1) {
                System.out.println("Computer choose PAPER.");
            } else System.out.println("Computer choose SCISSOR.");

            //System.out.println("Computer choice: "+computerInput);
            if (a==computerInput){
                System.out.println("Its a DRAW!!");
            } else if (a==0 && computerInput==2 || a==1 && computerInput==0 || a==2 && computerInput==1) {
                System.out.println("Hurray!! You WIN!!");
            } else System.out.println("Ahh!! You LOSE!!");

        } else System.out.println("Chose correct number.");
    }
}
