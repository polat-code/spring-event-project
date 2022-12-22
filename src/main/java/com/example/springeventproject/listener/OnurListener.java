package com.example.springeventproject.listener;

import com.example.springeventproject.event.TheBigBangTheoryEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class OnurListener implements ApplicationListener<TheBigBangTheoryEvent>
{
    public void watchBigBang(String episodeNo) {
        System.out.println("Onur : Started Watching BBT");
        System.out.println("Onur : Playing BBT : " + episodeNo);
    }

    //@EventListener
    // if you want to use EventListener then you should remove "ApplicationListener<TheBigBangTheoryEvent>"
    // Also we can change the method name "onApplicationEvent" with any name.
    @Override
    public void onApplicationEvent(TheBigBangTheoryEvent event) {
        watchBigBang(event.getEpisodeNo());
    }
}
