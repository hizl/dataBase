package javamaster.model;

import javamaster.BookModel;
import javamaster.dao.BooksDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class BooksDaoImpliments implements BooksDAO {

    //TODO connection
    String REQUEST_DATA_BASE_PARAM;

    Connection getConnection () {
        try {
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres/example_books_table",
                    "postgreadmin",
                    "123");
        } catch (SQLException throwables) {
            System.out.println("can't be connection "); throwables.printStackTrace();
        }
        return null;
    }



    @Override
    public List<BookModel> findAll() {
        return null;
    }

    @Override
    public BookModel findBy(Integer id) {
        return null;
    }

    @Override
    public BookModel save(BookModel bookModel) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
