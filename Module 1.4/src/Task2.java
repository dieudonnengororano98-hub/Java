import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many integers? ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("The array must contain at least one integer.");
            scanner.close();
            return;
        }

        int[] numbers = new int[size];

        System.out.println("Enter the integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maxSum = numbers[0];
        int bestStart = 0;
        int bestEnd = 0;

        for (int start = 0; start < size; start++) {
            int sum = 0;

            for (int end = start; end < size; end++) {
                sum += numbers[end];

                if (sum > maxSum) {
                    maxSum = sum;
                    bestStart = start;
                    bestEnd = end;
                }
            }
        }

        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Start index: " + (bestStart + 1));
        System.out.println("End index: " + (bestEnd + 1));

        scanner.close();
    }
}