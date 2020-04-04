package com.xmz.protolio.commons.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

    /**
     * 行业，外键
     */
    private Profession profession;
}