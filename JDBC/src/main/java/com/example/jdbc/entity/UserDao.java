package com.example.jdbc.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean insertUser(User user) {
        boolean status = false;
        try {
            String INSERT_SQL_QUERY = "insert into users(username, email,gender,city) values(?,?,?,?)";
            int count = jdbcTemplate.update(INSERT_SQL_QUERY, user.getName(), user.getEmail(), user.getGender(), user.getCity());
            if (count > 0)
                status = true;
            else
                status = false;


        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }
        return status;
    }

    public boolean updateUser(User user) {
        boolean status = false;
        try {
            String UPDATE_SQL_QUERY = "UPDATE users SET username=?,gender=?,city=? WHERE email=?";
            int count = jdbcTemplate.update(UPDATE_SQL_QUERY,user.getName(), user.getGender(), user.getCity(),user.getEmail());
            if (count > 0)
                status = true;
            else
                status = false;

        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }

        return status;
}
public boolean deletebyuserEmail(String email) {
        boolean status = false;
        try {
            String DELETE_SQL_QUERY = "DELETE from users where email=?";
            int count = jdbcTemplate.update(DELETE_SQL_QUERY, email);
            if (count > 0)
                status = true;
            else
                status = false;


        }
        catch (Exception e) {
            status = false;
            e.printStackTrace();

        }
        return status;

}
}
