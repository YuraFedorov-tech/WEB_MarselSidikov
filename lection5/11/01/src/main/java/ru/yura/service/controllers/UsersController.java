package ru.yura.service.controllers;
/*
 *
 *@Data 24.02.2020
 *@autor Fedorov Yuri
 *@project ru.yura
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.yura.service.repository.UsersRepository;

import javax.sql.DataSource;

@Controller
public class UsersController {
    @Autowired
    DataSource dataSource;

    @Value("${my.property}")
    private  String defaultAppName;

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/users")
    public String getUsersPage(ModelMap modelMap) {
        System.out.println(defaultAppName+9);
        modelMap.addAttribute("usersFromServer", usersRepository.findAll());
        return "users";
    }
}
