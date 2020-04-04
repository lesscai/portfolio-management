package com.xmz.protolio.commons.domain;

import lombok.Data;


@Data
public class Profession {
    private Long id;

    /**
     * 行业名称
     */
    private String professionName;

}