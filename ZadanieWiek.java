import java.util.Scanner;

public class ZadanieWiek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj swój wiek: ");
        int wiek = input.nextInt();

        if(wiek < 18){
            System.out.println("Nie możesz głosować");
        } else if( wiek >= 18 & wiek < 35){
            System.out.println("Możesz głosować ale nie możesz być prezydentem");
        } else {
            System.out.println("Możesz startować na prezydenta miasta");
        }

    }
}
