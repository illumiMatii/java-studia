import java.util.Scanner;
import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int numToGuess = random.nextInt(100);
        int tries = 0;
        boolean bool = false;

        while (!bool){
            System.out.println("Wpisz liczbę z zakresu od 0 do 100: ");
            guess = input.nextInt();
            if(numToGuess > guess){
                System.out.println("Za mało");
                tries += 1;
            } else if( numToGuess < guess){
                System.out.println("Za dużo");
                tries += 1;
            } else {
                System.out.println("Brawo! udało Ci się zgadnąć liczbę. Liczba prób: " + tries);
                bool = true;
            }
        }

    }
}
