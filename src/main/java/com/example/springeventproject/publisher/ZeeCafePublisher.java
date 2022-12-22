package com.example.springeventproject.publisher;

import com.example.springeventproject.event.ComedyCircusEvent;
import com.example.springeventproject.event.TheBigBangTheoryEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class ZeeCafePublisher {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;
    public void streamBigBangTheory(String episodeNo) {
        System.out.println("Zee Cafe : Starting  BBT " + episodeNo);
        applicationEventPublisher.publishEvent(new TheBigBangTheoryEvent(this, episodeNo));
    }

    public void streamComedyCircus(String episodeNo) {
        System.out.println("ComedyC Circus : Starting CC " + episodeNo);
        applicationEventPublisher.publishEvent(new ComedyCircusEvent(this, episodeNo));
    }
}
