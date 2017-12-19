package com.zhaoyou.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by zhaoyou on 19/12/2017.
 */
@Controller
public class FreemarkerController {

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @RequestMapping(value = "/freemarker")
    public String toFreemarker(Model model) {
        model.addAttribute("time", new Date());
        model.addAttribute("message", this.message);
        return "welcome";
    }

}
