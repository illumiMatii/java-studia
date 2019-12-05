package KolekcjeItd;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        Set<String> unic = new HashSet<>(words);

        String word;

        do {
            word = input.nextLine();
            words.add(word);
        } while (!"koniec".equals(word));

        unic.addAll(words);

        System.out.println(words.size());
        System.out.println(unic.size());
    }
}
