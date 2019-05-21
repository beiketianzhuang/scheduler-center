package com.lchen.beike.schedulercenter.controller.resp;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author : lchen
 * @date : 2019/5/21
 */
@Data
public class TriggerResp {

    private Long id;
    private Long jobId;
    private String cron;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
