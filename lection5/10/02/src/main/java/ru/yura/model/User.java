package ru.yura.model;
/*
 *
 *@Data 18.02.2020
 *@autor Fedorov Yuri
 *@project Spring-MVC
 *
 */



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

//@Entity
//@Table(name = "fix_user")
public class User {

    private Long id;

    private String firstName;

    private String lastName;
    
    private List<Car> cars;
}
