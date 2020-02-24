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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ru.yura.model.Car;
import ru.yura.repositories.CarsRepositories;

import java.util.List;

@Controller
public class CarsController {
    @Autowired
    private CarsRepositories carsRepositories;

    @RequestMapping(path = "/cars" , method = RequestMethod.GET)
    @ResponseBody
    public String getCarsByFirstName(@RequestParam(name = "first_name" , required = false) String firstName){
        List<Car> cars =carsRepositories.findAllByOwner_FirstName(firstName);
        return cars.toString();
    }
}
