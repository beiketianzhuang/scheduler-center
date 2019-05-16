package com.lchen.beike.schedulercenter.controller;

import com.lchen.beike.schedulercenter.controller.req.JobReq;
import com.lchen.beike.schedulercenter.controller.resp.JobResp;
import org.springframework.web.bind.annotation.*;

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
        return null;
    }

}
