package textadventure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import textadventure.Frage;

public class FileReader {
public static int counter=0;
    

    public ArrayList<Frage> readQuestionsFromFile(String fileName) {

        ArrayList<Frage> liste = new ArrayList<Frage>();
        try {
            Scanner scanner = new Scanner(new File(fileName),"UTF-8");

            while(scanner.hasNext()) {
                counter++;
                String line = scanner.nextLine();
                String[] words =line.split("#");
                int richtig = Integer.parseInt(words[5]);
                Frage f = new Frage(words[0],words[1],words[2],words[3],words[4],richtig);
                liste.add(f);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return liste;
    }


}
