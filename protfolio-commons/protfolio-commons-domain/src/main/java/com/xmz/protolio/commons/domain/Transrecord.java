package com.xmz.protolio.commons.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Transrecord {
    private Long id;

    /**
     * 来源资金账号
     */
    private String accountNumber1;

    /**
     * 收款资金账号
     */
    private String accountNumber2;

    /**
     * 转账时间
     */
    private Date transDate;

    /**
     * 金额
     */
    private Float amounts;

    /**
     * 状态（1成功，2失败）
     */
    private Boolean transStatus;

    /**
     * 银行流水号
     */
    private String serialNumber;

    /**
     * 备注
     */
    private String remarks;
}