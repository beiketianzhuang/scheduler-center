package com.lchen.beike.schedulercenter.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author : lchen
 * @date : 2019/5/16
 */
@DisallowConcurrentExecution
public class CommonJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

    }
}
