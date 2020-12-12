package kz.msovet.springapp;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    @PostConstruct
    public void init() {
        System.out.println("Init Class");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Destroy Class");
    }
    @Override
    public List<String> getSong() {
        List<String> songs = new ArrayList<String>();
        songs.add("Bethoven");
        songs.add("Bah");
        songs.add("Murakami");

        return songs;
    }
}
