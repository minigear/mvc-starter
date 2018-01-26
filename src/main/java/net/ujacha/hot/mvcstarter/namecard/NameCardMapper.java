package net.ujacha.hot.mvcstarter.namecard;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface NameCardMapper {

    NameCard findById(@Param("id") long id);

    List<NameCard> findAll();
}
