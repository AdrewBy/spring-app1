package ru.alishev.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;



public class ClassicalMusic implements Music{
    @PostConstruct  // не используются после 11 java. нужно подгружать зависимости в POM
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

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
