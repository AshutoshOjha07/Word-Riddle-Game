import java.util.Scanner;

public class WordRiddleGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] riddles = {
            "I am taken from a mine, and shut up in a wooden case, from which I am never released, and yet I am used by almost every person. What am I?",
            "I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?",
            "What has an eye, but cannot see?",
            "What is full of holes but still holds water?"
        };
        String[] answers = {
            "Pencil",
            "Echo",
            "A needle",
            "A sponge",
        };

        int score = 0;

        System.out.println("Welcome to the Word Riddle Game!");
        System.out.println("Try to solve the riddles. Type your answer and press Enter.");
        for (int i = 0; i < riddles.length; i++) {
            System.out.println("\nRiddle " + (i + 1) + ": " + riddles[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct! You solved the riddle.");
                score++;
            } else {
                System.out.println("Incorrect. The answer is: " + answers[i]);
            }

            System.out.println("Your score: " + score);


            if (i < riddles.length - 1) {
                 System.out.print("Do you want to play another riddle? (yes/no): ");
                 String playAgain = scanner.nextLine().toLowerCase();
                 if (!playAgain.equals("yes")) {
                     break;
                 }
            }
        }

        System.out.println("\nGame over! Your final score is: " + score);
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
