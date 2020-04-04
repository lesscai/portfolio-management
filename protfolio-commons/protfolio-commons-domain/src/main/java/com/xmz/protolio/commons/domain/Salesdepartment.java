package com.xmz.protolio.commons.domain;

import lombok.Data;


@Data
public class Salesdepartment {
    private Long id;

    /**
     * 营业部名称
     */
    private String departName;

    /**
     * 营业部电话
     */
    private String departPhone;

}