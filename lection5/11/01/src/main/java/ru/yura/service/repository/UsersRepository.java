package ru.yura.service.repository;
/*
 *
 *@Data 24.02.2020
 *@autor Fedorov Yuri
 *@project ru.yura
 *
 */

import org.springframework.data.jpa.repository.JpaRepository;
import ru.yura.service.model.User;

import java.util.List;

public interface UsersRepository extends JpaRepository<User, Long> {
    List<User> findAllByFirstName(String firstName);
}
