package com.xmz.protfolio.service.bondbills.test;

import com.xmz.protfolio.service.bondsbill.ServiceBondsbillApplication;
import com.xmz.protfolio.service.bondsbill.mapper.BondsbillMapper;
import com.xmz.protolio.commons.domain.Bonds;
import com.xmz.protolio.commons.domain.Bondsbill;
import com.xmz.protolio.commons.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceBondsbillApplication.class)
public class Tests {

    @Autowired
    private BondsbillMapper bondsbillMapper;

    @Test
    public void add() {
        Bondsbill bondsbill = new Bondsbill();
        User user = new User();
        user.setId(1L);
        Bonds bonds = new Bonds();
        bonds.setId(3L);

        bondsbill.setAmounts(8552.05f);
        bondsbill.setBillType(1);
        bondsbill.setCreatedate(new Date());
        bondsbill.setBondSId(1L);
        bondsbill.setBonds(bonds);
        bondsbill.setUser(user);

        bondsbillMapper.add(bondsbill);
    }
}
