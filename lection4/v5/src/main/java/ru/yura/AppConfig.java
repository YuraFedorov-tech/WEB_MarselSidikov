package ru.yura;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 *
 *@Data 16.02.2020
 *@autor Fedorov Yuri
 *@project SpringJavaConfigDemo
 *
 */
@Configuration
@ComponentScan(basePackages = "ru.yura")
public class AppConfig {
    @Bean
    public MessageRenderer messageRenderer(){
        return new MessageRendererStandartImpl(message2());
    }

    @Bean
    public Message message(){
        return new Hello("Mama");
    }
    @Bean
    public Message message2(){
        return new Buy("cat");
    }
}
