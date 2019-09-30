package com.makeit.learn.springcloud.dom.member.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "order-server", fallback = MemberServiceMock.class)
public interface MemberService {

    @RequestMapping("/orderTest")
    public String orderTest();

}
