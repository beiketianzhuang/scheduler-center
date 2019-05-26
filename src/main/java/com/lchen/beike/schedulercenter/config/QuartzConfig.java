package com.lchen.beike.schedulercenter.config;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.ee.servlet.QuartzInitializerListener;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author : lchen
 * @date : 2019/5/16
 */
@Configuration
public class QuartzConfig {

//    @Bean
    public Scheduler schedule() throws  IOException, SchedulerException {
        SchedulerFactory schedulerFactory = new StdSchedulerFactory(quartzProperties());
        Scheduler scheduler = schedulerFactory.getScheduler();
        scheduler.start();
        return scheduler;
    }

    public static Properties quartzProperties() throws IOException {
        Properties prop = new Properties();
        File file = ResourceUtils.getFile("classpath:quartz.properties");
        FileInputStream in = new FileInputStream(file);
        prop.load(in);
        return prop;
    }

    /**
     * 监听到工程的启动，在工程停止再启动时可以让已有的定时任务继续进行
     *
     * @return
     */
//    @Bean
    public QuartzInitializerListener quartzInitializerListener() {
        return new QuartzInitializerListener();
    }
}
