package com.example.springeventproject.publisher;

import com.example.springeventproject.event.TheBigBangTheoryEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class ZeeCafePublisher {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;
    public void streamBigBangTheory(String episodeNo) {
        System.out.println("Zee Cafe : Starting  BBT " + episodeNo);
        applicationEventPublisher.publishEvent(new TheBigBangTheoryEvent(this, episodeNo));
    }
}
