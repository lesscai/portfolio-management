package com.xmz.protfolio.service.bondsbill.mapper;

import com.xmz.protolio.commons.domain.Bondsbill;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BondsbillMapper {

    List<Bondsbill> selectAll();

    void add(Bondsbill bondsbill);

}
