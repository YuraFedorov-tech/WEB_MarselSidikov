package ru.yura.DAO;

import ru.yura.model.User;

import java.util.List;
import java.util.Optional;

/*
 *
 *@Data 23.02.2020
 *@autor Fedorov Yuri
 *@project Spring-MVC
 *
 */
public interface CrudDAO<T> {
    Optional<T> find(Long id);
    void save(T model);
    void delete (Long id);
    void update(T model);
    List<T> findAll();
}
