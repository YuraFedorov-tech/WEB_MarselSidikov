package ru.yura.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 *
 *@Data 18.02.2020
 *@autor Fedorov Yuri
 *@project Spring-MVC
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car {

    private Long id;

    private String model;

    private User owner;

}
