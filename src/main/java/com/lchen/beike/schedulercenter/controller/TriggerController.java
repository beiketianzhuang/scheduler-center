package com.lchen.beike.schedulercenter.controller;

import com.google.common.collect.Lists;
import com.lchen.beike.schedulercenter.controller.req.JobReq;
import com.lchen.beike.schedulercenter.controller.req.TriggerReq;
import com.lchen.beike.schedulercenter.controller.resp.JobResp;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : lchen
 * @date : 2019/5/16
 */
public class TriggerController {


    //添加一个job
    @PostMapping(value = "/scheduler/triggers")
    public void addTrigger(@RequestBody TriggerReq triggerReq) {

    }

    @PutMapping(value = "/scheduler/triggers")
    public void updateTrigger(@RequestBody TriggerReq triggerReq) {

    }

    @DeleteMapping(value = "/scheduler/triggers/{id}")
    public void deleteTrigger(@PathVariable("id") Long id) {

    }

    @GetMapping(value = "/scheduler/triggers")
    public List<JobResp> triggersPaging() {
        return Lists.newArrayList();
    }
}
