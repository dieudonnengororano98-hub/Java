import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the integers into the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int[] unique = new int[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < count; j++) {
                if (numbers[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                unique[count] = numbers[i];
                count++;
            }
        }

        System.out.println();
        System.out.println("The array without duplicates:");
        for (int i = 0; i < count; i++) {
            System.out.print(unique[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}