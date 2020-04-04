package com.xmz.protolio.commons.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Identity {
    private Long id;

    /**
     * 身份证号
     */
    private String idNumber;

    /**
     * 姓名
     */
    private String idName;

    /**
     * 签发机关
     */
    private String idOffice;

    /**
     * 证件地址
     */
    private String idAddress;

    /**
     * 联系地址
     */
    private String contactAddress;

    /**
     * 起始期限
     */
    private Date idStart;

    /**
     * 结束期限
     */
    private Date idEnd;

    /**
     * 邮政编码
     */
    private Integer postal;

    /**
     * 所属职业的id
     */
    private Long jobId;

    /**
     * 学历（值对应的学历待定）
     */
    private Boolean qualifications;

    /**
     * 账户受益人和本人关系
     */
    private Boolean relation;

    /**
     * 实际控制人，同上
     */
    private Boolean controller;

    /**
     * 不良诚信记录(内容待定)
     */
    private Integer sincerity;
}