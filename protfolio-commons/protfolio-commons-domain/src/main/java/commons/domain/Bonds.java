package commons.domain;

import lombok.Data;

@Data
public class Bonds {
    private Long id;

    /**
     * 证券代码
     */
    private String bondscode;

    /**
     * 证券名称
     */
    private String bondsname;

    /**
     * 股票点数
     */
    private Float point;

}