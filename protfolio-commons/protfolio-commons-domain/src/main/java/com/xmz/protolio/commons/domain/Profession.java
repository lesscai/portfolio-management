package com.xmz.protolio.commons.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profession {
    private Long id;

    /**
     * 行业名称
     */
    private String professionName;

}