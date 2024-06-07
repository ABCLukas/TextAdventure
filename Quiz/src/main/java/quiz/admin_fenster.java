/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz;

/**
 *
 * @author jonaskompatscher
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class admin_fenster {

    public static void fragen_schreiben() {
        String schreiben = JOptionPane.showInputDialog("Schreiben Sie die Frage hinein Bsp: Hauptstadt von Italien?#Rom#Mailand#Bozen#Meran#1");
        if (schreiben != null) {
            try {
                Scanner scanner = new Scanner(new File("fragen.txt"));
                String text = "";
                while (scanner.hasNext()) {
                    text += scanner.nextLine() + "\n";
                }
                FileWriter myWriter = new FileWriter("fragen.txt");
                myWriter.write(text + schreiben);
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}

