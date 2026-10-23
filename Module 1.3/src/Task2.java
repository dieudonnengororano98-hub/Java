import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a binary number:");
        String binary = reader.nextLine();

        int decimal = 0;

        for (int i = 0; i < binary.length(); i++) {
            char bit = binary.charAt(i);

            decimal = decimal * 2;
            if (bit == '1') {
                decimal = decimal + 1;
            }
        }

        System.out.println("The decimal value is " + decimal);
    }
}