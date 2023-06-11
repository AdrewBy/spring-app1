package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //     Music music = context.getBean("musicBean", Music.class);
        //     MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();


        // как работает Spring через сеттер
        //   MusicPlayer musicPlayer1 = new MusicPlayer(); //создает bean(обьект) класса и использует пустой конструктор
        //   musicPlayer1.setMusic(); в качестве параметра передает тот бин, который был создан ранее
        //   <bean id="musicBean"
        //          class="ru.alishev.springcourse.ClassicalMusic">
        //    </bean>

    }
}
