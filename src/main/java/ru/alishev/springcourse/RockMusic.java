package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class RockMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String> list = new ArrayList<>();
        list.add("rockSong1");
        list.add("rockSong2");
        list.add("rockSong3");
        return list;

    }
}
