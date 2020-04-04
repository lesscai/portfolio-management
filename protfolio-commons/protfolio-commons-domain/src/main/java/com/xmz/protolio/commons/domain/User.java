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
    private String accountNumber;

    /**
     * 用户手机号
     */
    private String userPhone;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 交易密码
     */
    private String tradePassword;

    /**
     * 身份证号
     */
    private Long identityId;

    /**
     * 风险评估
     */
    private Long riskCount;

    /**
     * 开户类型
     */
    private Long accountTypeId;

    /**
     * 创建日期
     */
    private Date createDate;

    /**
     * 上次登录
     */
    private Date lastLogin;

    /**
     * 信息是否验证(1是2否)
     */
    private Boolean isCheckIdentity;

    /**
     * 是否被冻结(1是2否)
     */
    private Boolean isLock;

    /**
     * 是否审核通过(1是2否0正在审核)
     */
    private Boolean isChecked;

    /**
     * 营业部id
     */
    private Long departmentId;
}