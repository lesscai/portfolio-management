package com.xmz.protolio.commons.domain;

import lombok.Data;

@Data
public class Job {
    private Long id;

    /**
     * 职业名称
     */
    private String jobName;

    /**
     * 行业id，外键
     */
    private Long professionId;
}