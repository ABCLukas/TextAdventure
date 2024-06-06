/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textadventure;

/**
 *
 * @author JKompatscher
 */
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class beginning_reader {
  public static String reader() {
      String data = "";
    try {
      File myObj = new File("beginning.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine ()) {
         data = myReader.nextLine();
        
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    return data;
  }
}
    

