package ru.yura.model;

import lombok.*;

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
@ToString(exclude = "owner")
public class Car {

    private Long id;

    private String model;

    private User owner;

}
