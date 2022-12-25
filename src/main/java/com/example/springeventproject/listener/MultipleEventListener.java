package com.example.springeventproject.listener;

import com.example.springeventproject.event.ComedyCircusEvent;
import com.example.springeventproject.event.TheBigBangTheoryEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MultipleEventListener {
    @EventListener
    public void eventListener1(ComedyCircusEvent event) {
        System.out.println("Listening to first event by it");
    }

    @EventListener
    public void bigbangListener(TheBigBangTheoryEvent event){
        System.out.println("Listenning big bang theory by bigbandlistener method!");
    }


}
