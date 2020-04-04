package commons.domain;

import lombok.Data;


@Data
public class Salesdepartment {
    private Long id;

    /**
     * 营业部名称
     */
    private String departname;

    /**
     * 营业部电话
     */
    private String departphone;

}