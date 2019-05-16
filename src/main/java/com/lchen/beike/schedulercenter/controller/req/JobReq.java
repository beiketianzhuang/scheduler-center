package com.lchen.beike.schedulercenter.controller.req;

import lombok.Data;

/**
 * @author : lchen
 * @date : 2019/5/16
 */
@Data
public class JobReq {


    private String jobName;
    //失败重试次数
    private Integer repeatCount;
    //超时时间
    private Long timeout;

    private String description;
}
