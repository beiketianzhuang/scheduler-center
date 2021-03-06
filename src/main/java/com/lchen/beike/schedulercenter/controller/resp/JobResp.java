package com.lchen.beike.schedulercenter.controller.resp;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author : lchen
 * @date : 2019/5/16
 */
@Data
@Builder
public class JobResp {

    private Long id;

    private String jobName;
    //失败重试次数
    private Integer repeatCount;
    //超时时间
    private Long timeout;

    private String description;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
