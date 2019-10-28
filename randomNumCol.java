import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class randomNumCol {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> myList = new ArrayList<>();

        for (int i = 0; i < 6; i++){
            int randInt = random.nextInt(49) + 1;
            myList.add(randInt);
        }
        System.out.println(myList);
    }
}
