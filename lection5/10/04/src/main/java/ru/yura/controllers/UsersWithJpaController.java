package ru.yura.controllers;
/*
 *
 *@Data 24.02.2020
 *@autor Fedorov Yuri
 *@project Spring-MVC
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.yura.forms.UserForm;
import ru.yura.model.User;
import ru.yura.repositories.UsersRepository;

import java.util.List;

@Controller
public class UsersWithJpaController {
    @Autowired
    private UsersRepository usersRepository;

    @RequestMapping(path = "/jpa/users", method = RequestMethod.GET)
    public ModelAndView getUsers(@RequestParam(name = "first_name", required = false) String firstName) {
        List<User> users = null;
        if (firstName != null) {
            users = usersRepository.findAllByFirstName( firstName);
        } else {
            users = usersRepository.findAll();
        }
        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.addObject("usersFromServer", users);
        return modelAndView;
    }

    @RequestMapping(value = "/jpa/users", method = RequestMethod.POST)
    public String addUsers(UserForm userForm) {
        User newUser = User.from(userForm);
        usersRepository.save(newUser);
        return "redirect:/jpa/users";
    }


}
