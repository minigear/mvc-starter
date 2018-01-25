package net.ujacha.hot.mvcstarter.namecard;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.net.spi.nameservice.NameService;

import javax.annotation.Resource;
import java.util.List;

@Service("NameCardService")
public class NameCardServiceImpl implements NameCardService {

    @Autowired
    private NameCardMapper nameCardMapper;

    @Override
    public NameCard getNamecard(NameCard nameCard) {
        return nameCardMapper.getNameCard(nameCard);
    }

    @Override
    public List<NameCard> getNamecards(NameCard nameCard) {
        return null;
    }

    @Override
    public NameCard createNamecard(NameCard nameCard) {
        return null;
    }

    @Override
    public boolean updateNamecard(NameCard nameCard) {
        return false;
    }

    @Override
    public boolean deleteNamecard(NameCard nameCard) {
        return false;
    }
}
