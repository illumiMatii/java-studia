import java.util.Scanner;

public class FibonacciString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj ilość liczb w ciągu: ");
        int count = input.nextInt();
        int numOne = 0, numTwo = 1, numThree;

        for (int i = 2; i < count; i++){
            numThree = numOne + numTwo;
            System.out.println(" " + numThree);
            numOne = numTwo;
            numTwo = numThree;
        }

    }
}
