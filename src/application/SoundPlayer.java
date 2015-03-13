package application;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

/**
 * Created by Eirik on 13.03.2015.
 */

public class SoundPlayer {

    private Media bip = new Media(new File("src/wav/TMNT.wav").toURI().toString());
    private  static MediaPlayer mediaPlayer;
    private static HashMap<String,Media> sounds = new HashMap<>();

    public static HashMap<String, Media> getSounds() {
        return sounds;
    }

    public static void playSound(Media bip){
        mediaPlayer = new MediaPlayer(bip);
        mediaPlayer.play();
    }

    public  static void importFiles() throws IOException{
     /*   Files.walk(Paths.get("res/wav/")).forEach(filePath -> {
            if (Files.isRegularFile(filePath)) ;
            System.out.println( i +filePath.getFileName().toString());
           i++;
        });*/

        sounds.put("TMNT: Turtles in time - Pizza Time", new Media(new File("res/wav/TMNT.wav").toURI().toString()));
        sounds.put("Majora's Mask - Get Mask", new Media(new File("res/wav/Majora's Mask - Get Mask.wav").toURI().toString()));
        sounds.put("Starcraft 2 - Spawn More Overlords", new Media(new File("res/wav/spawn more overlords.wav").toURI().toString()));


    }





}