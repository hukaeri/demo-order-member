package com.makeit.learn.springcloud.dom.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @RequestMapping("orderTest")
    public String orderTest(){
        return "this is order";
    }

}
