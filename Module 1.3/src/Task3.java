import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter start:");
        int start = Integer.parseInt(reader.nextLine());

        System.out.println("Enter end:");
        int end = Integer.parseInt(reader.nextLine());

        for (int number = start; number <= end; number++) {
            boolean isPrime = number > 1;

            for (int divisor = 2; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }

        System.out.println();
    }
}