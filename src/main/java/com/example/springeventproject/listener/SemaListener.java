package com.example.springeventproject.listener;

import com.example.springeventproject.event.TheBigBangTheoryEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SemaListener implements ApplicationListener<TheBigBangTheoryEvent> {

    public void watchBigBang(String episodeNo) {
        System.out.println("Sema : Started Watching BBT");
        System.out.println("Sema : Playing BBT : " + episodeNo);
    }


    //@EventListener
    // if you want to use EventListener then you should remove "ApplicationListener<TheBigBangTheoryEvent>"
    @Override
    public void onApplicationEvent(TheBigBangTheoryEvent event) {
        watchBigBang(event.getEpisodeNo());
    }
}
