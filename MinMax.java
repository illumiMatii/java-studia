import java.util.Scanner;
import java.util.Random;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int min = 0;
        int max = 0;
        boolean minMax = false;

        while(!minMax) {
            System.out.println("Podaj wartość minimalną: ");
            min = input.nextInt();

            System.out.println("Podaj wartość maksymalną: ");
            max = input.nextInt();

            int randomInt = random.nextInt(max);

            if (min >= max) {
                System.out.println("Niepoprawny zakres liczb!");
            } else {
                minMax = true;
            }
        }

        int randomNum = random.nextInt(max - (min - 1)) + (min);
        System.out.println(randomNum);
    }
}