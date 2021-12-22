package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import web.config.BeanConfig;
//import web.config.zz;
import web.service.MyService;
import web.service.Service1;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    Service1 myService;

    @RequestMapping("")
    public String getCar(ModelMap modelMap, HttpServletRequest request) {
        modelMap.addAttribute("cars", myService.getCarList(request.getParameter("count")));
        return "cars";
    }


}
