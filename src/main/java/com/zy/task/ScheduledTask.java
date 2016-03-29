package com.zy.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ab804 on 2015/10/20 0020.
 */
@Component
public class ScheduledTask {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {

        System.out.println("CurrentTime is " + sdf.format(new Date()));

    }

}
