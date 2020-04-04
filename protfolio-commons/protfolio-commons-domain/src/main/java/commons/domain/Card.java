package commons.domain;

import lombok.Data;

@Data
public class Card {
    private Long id;

    /**
     * 银行id，外键
     */
    private Long bankid;

    /**
     * 用户id，外键
     */
    private Long userid;

    /**
     * 银行卡号
     */
    private String cardnumber;

    /**
     * 银行密码
     */
    private String cardpassword;

    /**
     * 余额
     */
    private Float balance;
}