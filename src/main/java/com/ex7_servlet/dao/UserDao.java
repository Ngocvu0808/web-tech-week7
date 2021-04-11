package com.ex7_servlet.dao;



import com.ex7_servlet.model.User;

import java.sql.SQLException;

public interface UserDao {
    User getUserByUserName(String username) throws SQLException, ClassNotFoundException;
}
