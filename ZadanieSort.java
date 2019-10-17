import java.util.Scanner;
import java.util.Arrays;

public class ZadanieSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Podaj pierwszą liczbę: ");
        num1 = input.nextInt();

        System.out.println("Podaj drugą liczbę: ");
        num2 = input.nextInt();

        System.out.println("Podaj trzecią liczbę: ");
        num3 = input.nextInt();

        int[] arr = {num1, num2, num3};

        Arrays.sort(arr);

        System.out.println("Wynik sortowania:" + Arrays.toString(arr));


    }
}
