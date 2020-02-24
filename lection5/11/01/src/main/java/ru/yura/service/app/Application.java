package ru.yura.service.app;
/*
 *
 *@Data 24.02.2020
 *@autor Fedorov Yuri
 *@project ru.yura
 *
 */


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@ComponentScan(basePackages = "ru.yura.service")
@EnableJpaRepositories(basePackages = "ru.yura.service.repository")
@EntityScan(basePackages = "ru.yura.service.model")
public class Application {
    @Value("${my.property}")
    private static String defaultAppName;


    @Value("${my.property}")
    private  String my;
    public static void main(String[] args) {
        System.out.println(new Application().my+9+defaultAppName);
        SpringApplication.run(Application.class);
    }
}
