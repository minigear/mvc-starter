package net.ujacha.hot.mvcstarter.namecard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NameCardDao extends JdbcDaoSupport {

    @PostConstruct
    public void initialize(){

        ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
        populator.addScript(new ClassPathResource("init.sql"));
        DatabasePopulatorUtils.execute(populator, getDataSource());

    }

    public NameCard findById(long id) {

        String sql = "select * from NAMECARD where ID = ?";
        RowMapper<NameCard> rowMapper = new RowMapper<NameCard>() {
            @Override
            public NameCard mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new NameCard(
                        rs.getLong("ID"),
                        rs.getString("NAME"),
                        rs.getString("PHONENUMBER"),
                        rs.getString("MEMO"));
            }
        };
        return getJdbcTemplate().queryForObject(sql, rowMapper, id);

    }

    public void create(NameCard nameCard) {

        String sql = "insert into NAMECARD VALUES (null, ?, ?, ?)";
        getJdbcTemplate().update(sql, nameCard.getName(), nameCard.getPhoneNumber(), nameCard.getMemo());


    }
}
