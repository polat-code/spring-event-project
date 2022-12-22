package com.example.springeventproject.event;

import org.springframework.context.ApplicationEvent;

public class TheBigBangTheoryEvent extends ApplicationEvent {

    private String episodeNo;
    public TheBigBangTheoryEvent(Object source) {
        super(source);
    }

    public TheBigBangTheoryEvent(Object source, String episodeNo) {
        super(source);
        this.episodeNo = episodeNo;
    }

    public String getEpisodeNo() {
        return episodeNo;
    }





}
