/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textadventure;

/**
 *
 * @author acer
 */
public class backpicture_out {

    public static String backpicture(int nr) {
        String dateiname = "";
        switch (nr) {
            case 1:
                dateiname = "room_behind_se_kitschen.png";
                break;
            case 2:
                dateiname = "smashed_window.png";
                break;
            case 3:
                dateiname = "dropped_weapon.png";
                break;
            case 4:
                dateiname = "medical_room.png";
                break;
            case 5:
                dateiname = "first_scene.png";
                break;
            case 6:
                dateiname = "englishtext/hope_enjoyed.txt";
                break;
            case 7:
                dateiname = "bloody_bathroom.png";
                break;
            case 8:
                dateiname = "opened_window.png";
                break;
            case 9:
                dateiname = "medical_room.png";
                break;
            case 10:
                dateiname = "clean_bathroom.png";
                break;
            case 11:
                dateiname = "out_of_medical_room.png";
                break;
            case 12:
                dateiname = "basement.png";
                break;
            case 13:
                dateiname = "old_bedroom.png";
                break;
            case 14:
                dateiname = "living_room.png";
                break;
            case 15:
                dateiname = "slenderman.png";
                break;
            case 16:
                dateiname = "work_room.png";
                break;
            default:
                break;
        }
        return dateiname;
    }
}
