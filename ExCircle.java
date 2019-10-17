import java.util.Scanner;

public class ExCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj promień koła: ");
        int r = input.nextInt();

        int square = r*r;
        float equal = (float)Math.PI * square;

        System.out.println("Pole koła wynosi: " + equal);
    }
}
