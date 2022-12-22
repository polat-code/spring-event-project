package com.example.springeventproject.listener;

import com.example.springeventproject.event.TheBigBangTheoryEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class OzgurhanListener implements ApplicationListener<TheBigBangTheoryEvent> {
    public void watchBigBang(String episodeNo) {
        System.out.println("Ozgurhan : Started Watching BBT");
        System.out.println("Ozgurhan : Playing BBT : " + episodeNo);
    }

    @Override
    public void onApplicationEvent(TheBigBangTheoryEvent event) {
        watchBigBang(event.getEpisodeNo());
    }
}
