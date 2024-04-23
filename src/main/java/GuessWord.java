import java.util.Scanner;

public class GuessWord {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int repeatGame;

        do {
            startGuessing();
            System.out.print("Do you wanna play again? (1 – Yes / 0 – No): ");
            repeatGame = input.nextInt();
            input.nextLine();
        } while (repeatGame == 1);

        System.out.println("Thanks! Good Bye!");
    }

    public static void startGuessing() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String target = words[(int) (Math.random() * words.length)];
        String guess;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Guess the word: ");
            guess = scanner.nextLine();
            compareWords(target, guess);
        } while (!guess.equals(target));

        System.out.println("You guessed the target word: " + target);
    }

    public static void compareWords(String target, String guess) {
        int maxLength = Math.min(target.length(), guess.length());
        String feedback = "";

        for (int i = 0; i < maxLength; i++) {
            if (target.charAt(i) == guess.charAt(i)) {
                feedback += target.charAt(i);
            } else {
                feedback += "#";
            }
        }

        if (feedback.length() < 15) {
            for (int i = feedback.length(); i < 15; i++) {
                feedback += "#";
            }
        }

        System.out.println(feedback);
    }
}
