package kz.msovet.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.duration}")
    private String duration;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2){
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(MusicType musicTypeEnum) {
        MusicType musicType = musicTypeEnum.getRandomType();
        Random random = new Random();

        if (musicType == MusicType.CLASSICAL) {
            int index = random.nextInt(music1.getSong().size());
            return music1.getSong().get(index);
        } else {
            int index = random.nextInt( music2.getSong().size());
            return music2.getSong().get(index);
        }
    }
}
