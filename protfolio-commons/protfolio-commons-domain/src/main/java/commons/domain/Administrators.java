package commons.domain;

import lombok.Data;


@Data
public class Administrators {
    private Long id;

    /**
     * 管理员编号
     */
    private String admincode;

    /**
     * 管理员姓名
     */
    private String adminname;

    /**
     * 管理员密码
     */
    private String adminpassword;
}