import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String [] firstname = {"Dieudonne","john","jayson","rutwe","ndumiwe"};
        String [] lastname = {"Ngororano","mukategeri","mukamusoni","nyiramahirwe"};
        System.out.println("how many random names the program should generate.");
        int numbers = Integer.parseInt(scanner.nextLine());

        for (int i= 0; i < numbers; i++){
            int firstIndex = random.nextInt(firstname.length);
            int lastIndex = random.nextInt(lastname.length);
            String fullname = firstname[firstIndex] + " " + lastname[lastIndex];

            System.out.println(fullname);


        }
    }
}