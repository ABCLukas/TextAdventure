/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textadventure;

import java.io.File;
import java.util.ArrayList;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

/**
 *
 * @author MathiasSchwienbacher
 */
public class AudioPlayer_logik {

    private static int current = 0;
    private static Clip clip = null;

    public static void start(int soundNr) {
        ArrayList<String> sounds = new ArrayList<>();
        sounds.add("sound1.wav");
        sounds.add("sound2.wav");
        sounds.add("sound3.wav");
        sounds.add("sound4.wav");

        if (soundNr >= 0 && soundNr < sounds.size()) {
            try {
                File sound = new File(sounds.get(soundNr));
                clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(sound));
                clip.start();
                Thread.sleep(clip.getMicrosecondLength() / 1000);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Fehler beim Abspielen der Adiodatei! " + "Audio: " + sounds.get(soundNr));
                System.out.println("Fehler beim Abspielen der Audiodatei: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Sound zwischen 0 und " + sounds.size() + " wählen.");
            System.out.println("Ungültige Zahl für die Songauswahl.");
        }
        current = soundNr;
    }

    public static void next() {
        start(current + 1);
    }

    public static void previous() {
        start(current - 1);
    }

    public static void reset() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            System.out.println("Aktueller Sound wurde gestoppt.");
        } else {
            System.out.println("Es läuft kein Sound, der gestoppt werden kann.");
        }
        current = 0;
    }
}
