package com.ssm.controller;

import com.ssm.service.HomeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Resource
    private HomeService homeService;

    @RequestMapping("/index")
    public String index(String name, Model model) {
        model.addAttribute("name", name);
        homeService.getStringLength(name);
        return "index";
    }
}
