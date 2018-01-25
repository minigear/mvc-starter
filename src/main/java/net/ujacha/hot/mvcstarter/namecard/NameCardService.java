package net.ujacha.hot.mvcstarter.namecard;

import java.util.List;

public interface NameCardService {

    public NameCard getNamecard(NameCard nameCard);
    public List<NameCard> getNamecards(NameCard nameCard);
    public NameCard createNamecard(NameCard nameCard);
    public boolean updateNamecard(NameCard nameCard);
    public boolean deleteNamecard(NameCard nameCard);

}
