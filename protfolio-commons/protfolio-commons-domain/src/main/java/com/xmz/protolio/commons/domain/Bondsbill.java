package com.xmz.protolio.commons.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bondsbill {
    private Long id;

    /**
     * 证券id外键
     */
    private Long bondSId;

    /**
     * 证券订单类型（1买入，2卖出）
     */
    private Integer billType;

    /**
     * 金额
     */
    private Float amounts;

    /**
     * 订单用户id外键
     */
    private Long userId;

    /**
     * 订单创建时间
     */
    private Date createdate;

    /**
     * 证券外键
     */
    private Bonds bonds;

    /**
     * 用户外键
     */
    private User user;
}