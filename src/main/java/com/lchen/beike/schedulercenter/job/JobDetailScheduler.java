package com.lchen.beike.schedulercenter.job;

import com.lchen.beike.schedulercenter.controller.req.JobReq;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : lchen
 * @date : 2019/5/16
 */
@Component
public class JobDetailScheduler {

    @Transactional(rollbackFor = Exception.class)
    public void addJobDetail(JobReq jobReq) {
        JobDetail jobDetail = JobBuilder.newJob(CommonJob.class).build();

    }
}
