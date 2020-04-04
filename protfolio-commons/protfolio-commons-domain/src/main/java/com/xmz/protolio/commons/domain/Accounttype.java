package com.xmz.protolio.commons.domain;

import lombok.Data;

@Data
public class Accounttype {
    private Long id;

    /**
     * 类型名称
     */
    private String accountTypeName;
}