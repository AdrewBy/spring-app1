package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
  private   List<String>  list = new ArrayList<>();

    {
        list.add("classicalSong1");
        list.add("classicalSong2");
        list.add("classicalSong3");
    }
    @Override
    public List<String> getSong() {
        return list;
    }
}
