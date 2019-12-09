package KolekcjeItd;

import java.io.*;
import java.util.ArrayList;


public class Second {
    public static void main(String[] args) throws IOException {
        FileInputStream fstream = new FileInputStream("NAPIS.txt");
        DataInputStream data_input = new DataInputStream(fstream);
        BufferedReader buffer =  new BufferedReader(new InputStreamReader(data_input));

        String strLine;

        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> wordsThree = new ArrayList<>();

        while ((strLine = buffer.readLine()) != null){
            strLine = strLine.trim();
            if ((strLine.length() != 0)){
                words.add(strLine);
            }
        }

        String checkWord;
        String checkSecondWord;


        for (int i = 0; i < words.size(); i++){
            checkWord = words.get(i);
            for (int j = 0; j < words.size(); j++){
                checkSecondWord = words.get(j);

                if (i != j){
                    if (checkWord.equals(checkSecondWord)){
                        if (wordsThree.contains(checkSecondWord)){
                            break;
                        } else{
                            wordsThree.add(checkWord);
                        }
                    }

                }
            }
        }

        System.out.println(wordsThree);
    }
}
