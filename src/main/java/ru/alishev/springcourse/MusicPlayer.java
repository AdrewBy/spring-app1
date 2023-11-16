package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }



    private  List<Music> listGenres;


    public MusicPlayer(List<Music> listGenres) {
        this.listGenres = listGenres;
    }

    public String playMusic() {
        Random random = new Random();

        return "Playing: " + listGenres.get(random.nextInt(listGenres.size())).getSong()
                + " with volume " + this.volume;

    }

}
