package com.makeit.learn.springcloud.dom.member.service;

import org.springframework.stereotype.Service;

@Service
public class MemberServiceMock implements MemberService {

    public String orderTest() {
        return "error2";
    }
}
