package com.xmz.protolio.commons.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Questionnaire {
    private Long id;

    /**
     * 问题类型
     */
    private String qType;

    /**
     * 问题文本地址
     */
    private String question;

}