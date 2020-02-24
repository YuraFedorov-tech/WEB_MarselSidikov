package ru.yura.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.yura.model.Car;

import java.util.List;

/*
 *
 *@Data 24.02.2020
 *@autor Fedorov Yuri
 *@project Spring-MVC
 *
 */
public interface CarsRepositories extends JpaRepository<Car,Long> {
    List<Car> findAllByOwner_FirstName(String firstName);

    @Query(nativeQuery = true, value = "SELECT * FROM fix_car WHERE model = ?1;")
    List<Car> findAllByModel(String model);
}
