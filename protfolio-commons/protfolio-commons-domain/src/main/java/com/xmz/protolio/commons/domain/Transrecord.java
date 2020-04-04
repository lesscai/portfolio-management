package com.xmz.protolio.commons.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Transrecord {
    private Long id;

    /**
     * 来源资金账号
     */
    private String accountnumber1;

    /**
     * 收款资金账号
     */
    private String accountnumber2;

    /**
     * 转账时间
     */
    private Date transdate;

    /**
     * 金额
     */
    private Float amounts;

    /**
     * 状态（1成功，2失败）
     */
    private Boolean transstatus;

    /**
     * 银行流水号
     */
    private String serialnumber;

    /**
     * 备注
     */
    private String remarks;
}