package com.xmz.protfolio.service.bondbills.test;

import com.xmz.protfolio.service.bonds.ServiceBondsApplication;
import com.xmz.protfolio.service.bonds.mapper.BondsMapper;
import com.xmz.protolio.commons.domain.Bonds;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceBondsApplication.class)
public class Tests {

    @Autowired
    private BondsMapper bondsMapper;

    @Test
    public void add() {
        Bonds bonds = new Bonds();
        bonds.setBondsCode("123");
        bonds.setBondsName("hello");
        bonds.setPoint(500.05f);

        bondsMapper.add(bonds);
    }
}
