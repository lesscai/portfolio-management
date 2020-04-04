package com.xmz.protolio.commons.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Accounttype {
    private Long id;

    /**
     * 类型名称
     */
    private String accountTypeName;
}