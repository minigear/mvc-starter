package net.ujacha.hot.mvcstarter.namecard;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

@Service
public class NameCardService {

    @Autowired
    private SqlSession sqlSession;

    private NameCardMapper nameCardMapper;

    @PostConstruct
    private void setup(){

        nameCardMapper = sqlSession.getMapper(NameCardMapper.class);
    }

    public NameCard getNameCard(NameCard nameCard) {

        nameCardMapper = sqlSession.getMapper(NameCardMapper.class);

        return nameCardMapper.findById(nameCard.getId());
    }

    public List<NameCard> getAllNameCards() {
        nameCardMapper = sqlSession.getMapper(NameCardMapper.class);
        return nameCardMapper.findAll();
    }

    public NameCard createNameCard(NameCard nameCard) {
        return null;
    }

    public boolean updateNameCard(NameCard nameCard) {
        return false;
    }

    public boolean deleteNameCard(NameCard nameCard) {
        return false;
    }
}
