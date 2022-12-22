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

    @Override
    public void onApplicationEvent(TheBigBangTheoryEvent event) {
        watchBigBang(event.getEpisodeNo());
    }
}
