package com.ex7_servlet.dao;


import com.ex7_servlet.model.Book;

import java.sql.SQLException;
import java.util.List;

public interface BookDao {
    List<Book> findByName(String name) throws ClassNotFoundException, SQLException;

    Book findById(Integer id) throws SQLException, ClassNotFoundException;

    void updateBook(Book book) throws ClassNotFoundException, SQLException;

    void delete(Integer id) throws ClassNotFoundException, SQLException;
}
