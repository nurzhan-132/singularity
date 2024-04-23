import java.util.Scanner;

public class GuessNumber {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int repeatGame;

        do {
            startGuessing();
            System.out.print("Do you wanna play again? (1 – Yes / 0 – No): ");
            repeatGame = input.nextInt();
        } while (repeatGame == 1);

        System.out.println("Thanks! Good Bye!");
    }

    public static void startGuessing() {
        int target = (int)(Math.random() * 10);
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Guess the number, (0 < n < 9): ");
            int guess = input.nextInt();

            if (guess == target) {
                System.out.println("You guessed the target number: " + target);
                return;
            } else if (target > guess) {
                System.out.println("Target number is greater than you guess");
            } else {
                System.out.println("Target number is less than you guess");
            }

            attempts--;
        }

        System.out.println("You lost. The target number was: " + target);
    }
}
