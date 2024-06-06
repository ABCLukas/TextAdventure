package textadventure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import textadventure.Frage;

public class FileReader {
public static int counter=0;
    

    public String readFile(String fileName) {
        try {
            Scanner scanner = new Scanner(new File(fileName),"UTF-8");

            while(scanner.hasNext()) {
                counter++;
                String line = scanner.nextLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return "Geat net";
    }


}
