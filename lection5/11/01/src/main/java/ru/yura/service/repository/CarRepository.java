package ru.yura.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.yura.service.model.Car;

import java.util.List;

/*
 *
 *@Data 24.02.2020
 *@autor Fedorov Yuri
 *@project ru.yura
 *
 */
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findAllByOwner_FirstName(String firstName);

    @Query(nativeQuery = true, value = "SELECT * FROM fix_car WHERE model = ?1;")
    List<Car> findAllByModel(String model);
}
