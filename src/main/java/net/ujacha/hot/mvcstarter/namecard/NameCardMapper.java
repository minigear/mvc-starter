package net.ujacha.hot.mvcstarter.namecard;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

@Repository("nameCardMapper")
@Mapper
public interface NameCardMapper {

    @Select("SELECT * FROM namecard WHERE id = #{id}")
    NameCard getNameCard(NameCard nameCard);

}
