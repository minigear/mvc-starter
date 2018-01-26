package net.ujacha.hot.mvcstarter;

import net.ujacha.hot.mvcstarter.namecard.NameCard;
import net.ujacha.hot.mvcstarter.namecard.NameCardDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/spring/root-config.xml")
@ActiveProfiles("local")
public class ApplicationContextTest {

    public static final Logger log =  LoggerFactory.getLogger(ApplicationContextTest.class);


    @Autowired
    private NameCardDao nameCardDao;

    @Test
    public void findById(){

        NameCard nameCard = nameCardDao.findById(1);
        log.debug("NameCard:{}", nameCard);

    }

    @Test
    public void create(){

        NameCard nameCard = new NameCard(0, "김상훈", "010-444-4444", "lemite4u@gmail.com");
        nameCardDao.create(nameCard);
        NameCard dbNameCard = nameCardDao.findById(2);

        log.debug("NameCard:{}", dbNameCard);

    }

}
