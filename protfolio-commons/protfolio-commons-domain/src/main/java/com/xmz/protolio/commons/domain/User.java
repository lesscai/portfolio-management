package com.xmz.protolio.commons.domain;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    /**
     * 主键
     */
    private Long id;

    /**
     * 资金账号
     */
    private String accountnumber;

    /**
     * 用户手机号
     */
    private String userphone;

    /**
     * 用户密码
     */
    private String userpassword;

    /**
     * 交易密码
     */
    private String tradepassword;

    /**
     * 身份证号
     */
    private Long identityid;

    /**
     * 风险评估
     */
    private Long riskcount;

    /**
     * 开户类型
     */
    private Long accounttypeid;

    /**
     * 创建日期
     */
    private Date createdate;

    /**
     * 上次登录
     */
    private Date lastlogin;

    /**
     * 信息是否验证(1是2否)
     */
    private Boolean ischeckidentity;

    /**
     * 是否被冻结(1是2否)
     */
    private Boolean islock;

    /**
     * 是否审核通过(1是2否0正在审核)
     */
    private Boolean ischecked;

    /**
     * 营业部id
     */
    private Long departmentid;
}