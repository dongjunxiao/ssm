package com.ssm.controller;

import com.ssm.service.HomeService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author xdj
 */
@Controller
public class HomeController {

    @Resource
    private HomeService homeService;

    private Logger logger = Logger.getLogger(HomeController.class);


    @RequestMapping("/index")
    public String index(String name, Model model) {
        model.addAttribute("name", name);
        homeService.getStringLength(name);
        logger.info(name);
        return "index";
    }
}
