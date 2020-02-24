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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.yura.DAO.UserDAO;
import ru.yura.forms.UserForm;
import ru.yura.model.User;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

//http://localhost:8080/users/?firstName=Yura
@Controller
public class UsersController {
    @Autowired
    private UserDAO userDAO;

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public ModelAndView getAllUsers(@RequestParam(value = "firstName", required = false) String firstName) {
        //  List<User> users =userDAO.findAll();
        List<User> users = null;
        if (firstName != null) {
            users = userDAO.findAllByFirstName(firstName);
        } else {
            users = userDAO.findAll();
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("users");
        modelAndView.addObject("usersFromServer", users);
        return modelAndView;
    }

    @RequestMapping(path = "/users/{user_id}", method = RequestMethod.GET)
    public ModelAndView getAllUserById(@PathVariable("user_id") Long id) {
        ModelAndView modelAndView = new ModelAndView("users");
        Optional<User> userCandidat = userDAO.find(id);
        userCandidat.ifPresent(user -> modelAndView.addObject("usersFromServer", Collections.singleton(user)));
        return modelAndView;
    }

    @RequestMapping(path = "/users", method = RequestMethod.POST)
    public String addUser(UserForm userForm) {
        User newUser = User.from(userForm);
        userDAO.save(newUser);
        return "redirect:/users";
    }

}
