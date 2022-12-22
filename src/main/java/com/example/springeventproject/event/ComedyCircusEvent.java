package com.example.springeventproject.event;

import org.springframework.context.ApplicationEvent;

import java.time.Clock;

public class ComedyCircusEvent extends ApplicationEvent {

    private String episodeNo;

    public ComedyCircusEvent(Object source) {
        super(source);
    }

    public ComedyCircusEvent(Object source, String episodeNo) {
        super(source);
        this.episodeNo = episodeNo;
    }

    public String getEpisodeNo() {
        return episodeNo;
    }
}
