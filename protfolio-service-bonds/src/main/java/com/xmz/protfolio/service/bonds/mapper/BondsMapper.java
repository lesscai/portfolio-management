package com.xmz.protfolio.service.bonds.mapper;

import com.xmz.protolio.commons.domain.Bonds;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BondsMapper {

    List<Bonds> selectAll();

    Bonds selectByCode(String bondsCode);

    void add(Bonds bonds);

}
