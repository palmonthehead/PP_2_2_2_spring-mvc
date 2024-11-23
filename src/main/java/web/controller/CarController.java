package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    private CarService carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String getCarsTable(@RequestParam(defaultValue = "5")
                                   String count, Model model) {
        model.addAttribute("cars", carService.getCars(Integer.parseInt(count)));
        return "cars";
    }
}
