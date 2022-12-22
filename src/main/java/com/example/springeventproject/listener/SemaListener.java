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


    @Override
    public void onApplicationEvent(TheBigBangTheoryEvent event) {
        watchBigBang(event.getEpisodeNo());
    }
}
