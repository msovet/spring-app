package kz.msovet.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( // response spring context
                "applicationContext.xml" // should be in resources
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//
//        firstMusicPlayer.setDuration(222);
//        System.out.println(comparison);
//
//        System.out.println(firstMusicPlayer.getDuration());
//        System.out.println(secondMusicPlayer.getDuration());
        //        musicPlayer.playMusic();
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getDuration());
        context.close();
    }
}
