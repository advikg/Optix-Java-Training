import java.text.BreakIterator;
import java.util.Random;
import java.util.Scanner;

public class imports {
    public static void main (String[] args) {
        Random phat_tonka = new Random();
        int men_lover_2000 = phat_tonka.nextInt(100);
        Scanner big_balls = new Scanner(System.in);
        int tries = 0;
        while (tries < 5) {
            int guess = big_balls.nextInt();
            if (guess == men_lover_2000) {
                System.out.println("You guessed the number!");
                break;
            }
            else if (guess > men_lover_2000) {
                System.out.println("Too high!");
                tries += 1;
            }
            else if (guess < men_lover_2000) {
                System.out.println("Too low!");
                tries++;
            }
        }
        if (tries == 5) { System.out.println("You lose!"); }
        else { System.out.println("You win!"); }
    }
}
