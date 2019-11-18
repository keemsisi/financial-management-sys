package com.neuralproject.financialmanagementsys.code.dao;


import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.neuralproject.financialmanagementsys.code.models.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Repository;

@Repository
public class OAuthDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public UserEntity getUserDetails(String username) {
        Collection<GrantedAuthority> grantedAuthoritiesList = new ArrayList<>();
        String userSQLQuery = "SELECT * FROM app_user WHERE username=?";
        List<UserEntity> list = jdbcTemplate.query(userSQLQuery, new String[] { username },
                (ResultSet rs, int rowNum) -> {

                    UserEntity user = new UserEntity();
                    user.setUsername(username);
                    user.setPassword(rs.getString("password"));
                    return user;
                });
        if (list.size() > 0) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ROLE_SYSTEMADMIN");
            grantedAuthoritiesList.add(grantedAuthority);
            list.get(0).setGrantedAuthoritiesList(grantedAuthoritiesList);
            return list.get(0);
        }
        return null;
    }
}