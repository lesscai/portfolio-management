package com.xmz.protolio.commons.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Administrators {
    private Long id;

    /**
     * 管理员编号
     */
    private String adminCode;

    /**
     * 管理员姓名
     */
    private String adminName;

    /**
     * 管理员密码
     */
    private String adminPassword;
}