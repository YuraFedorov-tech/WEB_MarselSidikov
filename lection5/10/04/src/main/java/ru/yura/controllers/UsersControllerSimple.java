package ru.yura.controllers;
/*
 *
 *@Data 23.02.2020
 *@autor Fedorov Yuri
 *@project Spring-MVC
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import ru.yura.DAO.UserDAO;
import ru.yura.model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class UsersControllerSimple implements Controller {

    @Autowired
    private UserDAO userDAO;

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
       if(httpServletRequest.getMethod().equals("GET")) {
           List<User> users = userDAO.findAll();
           ModelAndView modelAndView=new ModelAndView();
           modelAndView.setViewName("users");
           modelAndView.addObject("usersFromServer",users);
           return  modelAndView;
       }
        return null;
    }
}
