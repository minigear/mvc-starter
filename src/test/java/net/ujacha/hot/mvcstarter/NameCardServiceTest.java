package net.ujacha.hot.mvcstarter;

import net.ujacha.hot.mvcstarter.namecard.NameCard;
import net.ujacha.hot.mvcstarter.namecard.NameCardService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/spring/test-config.xml")
@ActiveProfiles("local")
public class NameCardServiceTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(NameCardServiceTest.class);

    @Autowired
    private NameCardService nameCardService;

    @Test
    public void test(){

        NameCard nameCard = nameCardService.getNameCard(new NameCard(1));
        LOGGER.debug("nameCard:{}", nameCard);

        Assert.assertNotNull(nameCard);

    }


}
