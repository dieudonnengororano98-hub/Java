import java.util.Scanner;

public class Task2{
    public static void main(String[] orgs) {
        Scanner reader = new Scanner(System.in);

        System.out.println("give the lengths of the first leg ");
        Double a = Double.parseDouble(reader.nextLine());

        System.out.println("give the lengths of the second leg");
        Double b = Double.parseDouble(reader.nextLine());

        double c = Math.sqrt(a * a + b * b);

        System.out.println("The length of the hypotenuse is " + c);
    }

    }