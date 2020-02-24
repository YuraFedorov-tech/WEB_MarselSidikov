package ru.yura.controllers;
/*
 *
 *@Data 23.02.2020
 *@autor Fedorov Yuri
 *@project Spring-MVC
 *
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.yura.DAO.UserDAO;
import ru.yura.model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class UsersController {
    @Autowired
    private UserDAO userDAO;

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public ModelAndView getAllUsers() {
        List<User> users =userDAO.findAll();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("users");
        modelAndView.addObject("usersFromServer",users);
        return modelAndView;
    }

}
