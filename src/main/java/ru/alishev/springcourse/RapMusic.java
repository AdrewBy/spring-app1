package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class RapMusic implements Music{
    private   List<String>  list = new ArrayList<>();

    {
        list.add("rapSong1");
        list.add("rapSong2");
        list.add("rapSong3");
    }
    @Override
    public List<String> getSong() {
        return list;
    }
}
