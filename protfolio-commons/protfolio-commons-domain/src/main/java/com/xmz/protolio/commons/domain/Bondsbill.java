package com.xmz.protolio.commons.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Bondsbill {
    private Long id;

    /**
     * 证券id外键
     */
    private Long bondsid;

    /**
     * 证券订单类型（1买入，2卖出）
     */
    private Boolean billtype;

    /**
     * 金额
     */
    private Float amounts;

    /**
     * 订单用户id外键
     */
    private Long userid;

    /**
     * 订单创建时间
     */
    private Date createdate;
}