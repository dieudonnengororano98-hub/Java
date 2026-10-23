import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int points;

        do {
            points = 0;

            for (int i = 1; i <= 10; i++) {
                int first = (int) (Math.random() * 10) + 1;
                int second = (int) (Math.random() * 10) + 1;

                System.out.println("Question " + i + ": " + first + " * " + second + " = ?");
                int answer = Integer.parseInt(reader.nextLine());

                if (answer == first * second) {
                    System.out.println("Correct!");
                    points++;
                } else {
                    System.out.println("Wrong. The correct answer is " + (first * second));
                }
            }

            System.out.println("You scored " + points + " out of 10.");
        } while (points < 10);

        System.out.println("Congratulations! You have mastered the multiplication tables.");
    }
}

