package ru.yura.service.model;

import lombok.*;

import javax.persistence.*;

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
@Entity
@Table(name = "fix_car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "model")
    private String model;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

}
