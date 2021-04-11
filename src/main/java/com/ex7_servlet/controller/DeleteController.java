package com.ex7_servlet.controller;



import com.ex7_servlet.dao.BookDao;
import com.ex7_servlet.dao.impl.BookDaoImpl;
import com.ex7_servlet.model.Book;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/delete")
public class DeleteController extends HttpServlet {

    private final BookDao bookDao;
    private Book book;

    public DeleteController() {
        this.bookDao = new BookDaoImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("bookId");
        try {
            book = bookDao.findById(Integer.parseInt(id));
            req.setAttribute("book", book);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        RequestDispatcher dispatcher = req.getRequestDispatcher("hom.jsp");
        resp.sendRedirect("/ex7_servlet_war_exploded/home");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("bookId"));
        try {
            bookDao.delete(id);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        RequestDispatcher dp = req.getRequestDispatcher("delete-success.jsp");
        dp.forward(req, resp);
    }

}
