package commons.domain;

import lombok.Data;

@Data
public class Investment {
    private Long id;

    /**
     * 投资项目名
     */
    private String invname;

    /**
     * 风险评估,外键
     */
    private Long riskid;

    /**
     * 投资期限
     */
    private String term;
}