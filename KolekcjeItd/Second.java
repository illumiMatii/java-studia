package KolekcjeItd;

import java.io.*;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;


public class Second {
    public static void main(String[] args) throws IOException {
        FileInputStream fstream = new FileInputStream("NAPIS.txt");
        DataInputStream data_input = new DataInputStream(fstream);
        BufferedReader buffer =  new BufferedReader(new InputStreamReader(data_input));

        String str_line;

        ArrayList<String> words = new ArrayList<>();
        Set<String> unic = new HashSet<>(words);

        while ((str_line = buffer.readLine()) != null){
            str_line = str_line.trim();
            if ((str_line.length() != 0)){
                words.add(str_line);
            }
        }

        System.out.println(words);
        System.out.println(unic);


        for (int i = 0; i < words.size(); i++){

        }
    }
}
