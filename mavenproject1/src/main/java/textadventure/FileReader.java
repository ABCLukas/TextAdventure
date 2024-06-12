package textadventure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
public static int counter=0;
    

    public static String reader(int nr) {
      String data = "";
      String dateiname = "";
    switch (nr) {
        case 1:
            dateiname = "englishtext/crowbar.txt";
            break;
        case 2:
            dateiname = "englishtext/destroyed_window_work_room.txt";
            break;
        case 3:
            dateiname = "englishtext/dropped_weapon.txt";
            break;
        case 4:
            dateiname = "englishtext/entered_medical_room.txt";
            break;
            case 5:
            dateiname = "englishtext/first_scene.txt";
            break;
            case 6:
            dateiname = "englishtext/hope_enjoyed.txt";
            break;
            case 7:
            dateiname = "englishtext/left_door.txt";
            break;
            case 8:
            dateiname = "englishtext/opened_window.txt";
            break;
            case 9:
            dateiname = "englishtext/rescue_manuel.txt";
            break;
            case 10:
            dateiname = "englishtext/right_door.txt";
            break;
            case 11:
            dateiname = "englishtext/running_out_medical_room.txt";
            break;
            case 12:
            dateiname = "englishtext/stairs_down.txt";
            break;
            case 13:
            dateiname = "englishtext/stairs_up.txt";
            break;
            case 14:
            dateiname = "englishtext/stay_living_room.txt";
            break;
            case 15:
            dateiname = "englishtext/threw_hammer.txt";
            break;
            case 16:
            dateiname = "englishtext/work_room.txt";
            break;
            default:
            break;
    }
    try {
      File myObj = new File(dateiname);
      Scanner myReader = new Scanner(myObj,"utf-8");
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
    //lei zum debuggen
    public static void main(String[] args) {
        System.out.println(reader(2));
    }
}
