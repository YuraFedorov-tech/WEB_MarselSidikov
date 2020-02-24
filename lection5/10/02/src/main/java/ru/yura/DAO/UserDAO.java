package ru.yura.DAO;

import ru.yura.model.User;

import java.util.List;

/*
 *
 *@Data 23.02.2020
 *@autor Fedorov Yuri
 *@project Spring-MVC
 *
 */
public interface UserDAO extends CrudDAO<User> {
    List<User> findAllByFirstName(String firstName);
}
