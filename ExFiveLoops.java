import java.io.*;

public class ExFiveLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        int firstNum = input.nextInt();

        System.out.println("Podaj drugą liczbę: ");
        int secondNum = input.nextInt();

        if (firstNum < secondNum){
            for (int i = firstNum; i < secondNum; i++){
                System.out.println(i);
            }
            } else if (firstNum > secondNum || firstNum == secondNum){
                System.out.println("Żle podane parametry");
            }
    }
}
