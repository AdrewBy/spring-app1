package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private RapMusic rapMusic;
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, RapMusic rapMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.rapMusic = rapMusic;
    }



    public void playMusic(Genres genres) {
        Random random = new Random();
        // случайное целое число между 0 и 2
        int randomNumber = random.nextInt(3);
        if(genres == Genres.CLASSICAL){
            // случайная классическая песня
            System.out.println(classicalMusic.getSong().get(randomNumber));
        } else if(genres == Genres.ROCK){
            // случайная рок песня
            System.out.println(rockMusic.getSong().get(randomNumber));
        }else {
            System.out.println(rapMusic.getSong().get(randomNumber));
        }

    }

}
