package textadventure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
public static int counter=0;
    

    public static String reader(int nr) {
      String data = "";
      String dateiname = "";
      if(nr == 1){
          dateiname = "englishtext/crowbar.txt";
      }
    try {
      File myObj = new File("beginning.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
         data += myReader.nextLine();
        data += "\n";
      }
        
        
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    return data;
  }
}
