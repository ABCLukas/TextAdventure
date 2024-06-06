/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textadventure;

/**
 *
 * @author JKompatscher
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class beginning_reader{

public static String readFileToString(String filePath) {
StringBuilder content = new StringBuilder();

try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
String line;
while ((line = reader.readLine()) != null) {
content.append(line).append("\n");
}
} catch (IOException e) {
e.printStackTrace();
}


return content.toString();

}


}
    

