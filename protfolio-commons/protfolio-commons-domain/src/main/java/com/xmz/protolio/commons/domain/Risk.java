package com.xmz.protolio.commons.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Risk {
    private Long id;

    /**
     * 评分（等级）
     */
    private Integer riskScore;

}