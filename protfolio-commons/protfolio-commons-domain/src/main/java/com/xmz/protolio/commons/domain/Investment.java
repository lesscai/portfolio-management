package com.xmz.protolio.commons.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Investment {
    private Long id;

    /**
     * 投资项目名
     */
    private String invName;

    /**
     * 风险评估,外键
     */
    private Long riskId;

    /**
     * 投资期限
     */
    private String term;

    private Risk risk;
}