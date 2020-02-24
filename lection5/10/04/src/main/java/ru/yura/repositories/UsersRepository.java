package ru.yura.repositories;
/*
 *
 *@Data 24.02.2020
 *@autor Fedorov Yuri
 *@project Spring-MVC
 *
 */

import org.springframework.data.jpa.repository.JpaRepository;
import ru.yura.model.User;

import java.util.List;

public interface UsersRepository extends JpaRepository<User, Long> {
    List<User> findAllByFirstName(String firstName);
}
