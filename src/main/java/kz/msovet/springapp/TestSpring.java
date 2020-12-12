package kz.msovet.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.SpringVersion;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( // response spring context
                "applicationContext.xml" // should be in resources
        );

//        Music music = context.getBean("classicalMusic", Music.class);
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        context.close();
    }
}
