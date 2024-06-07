/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz;

import javax.swing.JFrame;

/**
 *
 * @author jonaskompatscher
 */
public class main_quiz {
    public static void main(String[] args) {
           start_gui fenster=new start_gui(); //Start Fenster öffnen
           //quiz_gui fenster=new quiz_gui();
     fenster.setTitle("Quiz");//Ändert das obere name des Fensters
    fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenster.setVisible(true);
    }
    
}
