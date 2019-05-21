package com.lchen.beike.schedulercenter.controller;

import com.google.common.collect.Lists;
import com.lchen.beike.schedulercenter.controller.req.JobReq;
import com.lchen.beike.schedulercenter.controller.resp.JobResp;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author : lchen
 * @date : 2019/5/16
 */
@RestController
public class JobController {

    //添加一个job
    @PostMapping(value = "/scheduler/jobs")
    public void addJob(@RequestBody JobReq jobReq) {

    }

    @PutMapping(value = "/scheduler/jobs")
    public void updateJob(@RequestBody JobReq jobReq) {

    }

    @DeleteMapping(value = "/scheduler/jobs/{id}")
    public void deleteJob(@PathVariable("id") Long id) {

    }

    @GetMapping(value = "/scheduler/jobs")
    public List<JobResp> jobsPaging() {
        return Lists.newArrayList(JobResp
                .builder()
                .id(1L)
                .jobName("test")
                .repeatCount(10)
                .timeout(100L)
                .description("测试")
                .updatedAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build());
    }

}
