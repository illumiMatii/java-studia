import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.println("Podaj pierwszy bok: ");
        a = input.nextInt();

        System.out.println("Podaj drugi bok: ");
        b = input.nextInt();

        System.out.println("Podaj trzeci bok: ");
        c = input.nextInt();

        int asquare = a*a;
        int bsquare = b*b;
        int csquare = c*c;

        if(a + b > c && a + c > b && b + c > a){
            System.out.println("Te boki tworzą trójkąt");
            if((asquare + bsquare == csquare) || (asquare + csquare == bsquare) || (bsquare + csquare == asquare)){
                System.out.println("Ten trójkąt jest prostokątny");
            } else{
                System.out.println("Ten trójkąt nie jest prostokątny");
            }

        } else {
            System.out.println("Podane boki nie tworzą trójkąta");
        }
    }
}
