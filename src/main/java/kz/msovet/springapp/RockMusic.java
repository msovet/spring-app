package kz.msovet.springapp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
//@Scope("prototype")
public class RockMusic implements Music {

    @PostConstruct
    public void init() {
        System.out.println("Init Rock");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Destroy Rock");
    }
    @Override
    public List<String> getSong() {
        List<String> songs = new ArrayList<String>();
        songs.add("Jackson");
        songs.add("Coi");
        songs.add("Gaissin");

        return songs;
    }



}
