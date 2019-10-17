import java.util.Random;
import java.util.Arrays;

public class randomSix {
    public static void main(String[] args) {
        Random random = new Random();

        int tab[] = new int[6];

        for (int i = 0; i < 6; i ++){
            tab[i] = random.nextInt(49);
            System.out.println(tab[i]);
        }

    }
}
