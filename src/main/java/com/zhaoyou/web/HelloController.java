package com.zhaoyou.web;

import com.zhaoyou.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaoyou on 19/12/2017.
 */
@RestController
public class HelloController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/")
    public String toIndex() {
        return "Hello world";
    }

    @RequestMapping(value = "/jdbc")
    public String toJdbc() {
        return customerService.getString().toString();
    }



}
