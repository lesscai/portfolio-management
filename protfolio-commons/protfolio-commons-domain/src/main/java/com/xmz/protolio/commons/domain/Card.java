package com.xmz.protolio.commons.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private Long id;

    /**
     * 银行id，外键
     */
    private Long bankId;

    /**
     * 用户id，外键
     */
    private Long userId;

    /**
     * 银行卡号
     */
    private String cardNumber;

    /**
     * 银行密码
     */
    private String cardPassword;

    /**
     * 余额
     */
    private Float balance;

    /**
     * 银行，外键
     */
    private Bank bank;

    /**
     * 用户外键
     */
    private User user;
}