package commons.domain;

import lombok.Data;

@Data
public class Risk {
    private Long id;

    /**
     * 评分（等级）
     */
    private Integer riskscore;

}