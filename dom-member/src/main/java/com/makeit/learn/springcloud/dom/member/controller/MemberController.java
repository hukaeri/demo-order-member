package com.makeit.learn.springcloud.dom.member.controller;

import com.makeit.learn.springcloud.dom.member.service.MemberService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MemberController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private MemberService memberService;

    @RequestMapping("/memTest2")
    public String memTest2() {
        String str = memberService.orderTest();
        return str;
    }

    @HystrixCommand(fallbackMethod = "testError")
    @RequestMapping("/memTest")
    public String memTest() {
        String str = restTemplate.getForObject("http://order-server/orderTest", String.class);
        return str;
    }

    public String testError() {
        //远程调用失败，调用此方法
        return "error1";
    }

}