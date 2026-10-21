import java.util.Scanner;

public class Task3 {
    public static void main(String[] orgs) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter weight in grams");
        double weight = Double.parseDouble(reader.nextLine());

        double luotiInGrams = 13.28;
        int naulaInLuoti = 32;
        int leiviskäInNaula = 20;

        double naulaInGrams = luotiInGrams * naulaInLuoti;
        double leiviskäInGrams = naulaInGrams * leiviskäInNaula;

        int leiviskä = (int) (weight / leiviskäInGrams);
        double remainder1 = weight % leiviskäInGrams;

        int naula = (int) (remainder1 / naulaInGrams);
        double remainder2 = remainder1 % naulaInGrams;

        double luoti = remainder2 / luotiInGrams;

        System.out.printf("%.2f grams is %d leiviskä, %d naula, and %.2f luoti.%n",
                weight, leiviskä, naula, luoti);
    }
}