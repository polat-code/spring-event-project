package com.example.springeventproject.listener;

import com.example.springeventproject.event.ComedyCircusEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AhmetListener {

    public void watchBigBang(String episodeNo) {
        System.out.println("Ahmet : Started Watching ComedyCircus");
        System.out.println("Ahmet : Playing ComedyCircus : " + episodeNo);
    }
    @EventListener
    public void printComedyMessage(ComedyCircusEvent event) {
        watchBigBang(event.getEpisodeNo());
    }
}
