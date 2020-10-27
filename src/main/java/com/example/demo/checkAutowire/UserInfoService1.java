package com.example.demo.checkAutowire;

import org.springframework.stereotype.Component;

@Component
public class UserInfoService1 {
    private String msg;

//    @Override
//    public String toString() {
//        return "UserInfoService1{" +
//                "msg='" + msg + '\'' +
//                '}';
//    }

    public String getMsg() {
        return msg;
    }

    public String setMsg(String msg) {
        this.msg = msg;
        return msg;
    }

//    public UserInfoService1(String msg) {
//        this.msg = msg;
//    }
}
