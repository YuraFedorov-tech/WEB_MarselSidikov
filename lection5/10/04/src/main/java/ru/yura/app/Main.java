package ru.yura.app;
/*
 *
 *@Data 23.02.2020
 *@autor Fedorov Yuri
 *@project Spring-MVC
 *
 */

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.yura.DAO.UserDAO;
import ru.yura.DAO.UsersDaoJdbcTemplateImpl;
import ru.yura.model.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUsername("postgres");
        dataSource.setPassword("123");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/db_example");

        UserDAO usersDao = new UsersDaoJdbcTemplateImpl(dataSource);

        List<User> users = usersDao.findAll();

        System.out.println(users);
    }
}
