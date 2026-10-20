import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Temperature in Fahrenheit: ");
        double fahrenheit = Double.parseDouble(reader.nextLine());

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("Celsius: %.1f%n", celsius);

        reader.close();
    }
}