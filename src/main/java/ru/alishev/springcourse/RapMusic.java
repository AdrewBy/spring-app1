package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RapMusic implements Music{

    @Override
    public String getSong() {
        return "rapSong1";
    }
}
