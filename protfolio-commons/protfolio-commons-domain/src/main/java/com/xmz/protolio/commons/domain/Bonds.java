package com.xmz.protolio.commons.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bonds {
    private Long id;

    /**
     * 证券代码
     */
    private String bondsCode;

    /**
     * 证券名称
     */
    private String bondsName;

    /**
     * 股票点数
     */
    private Float point;

}