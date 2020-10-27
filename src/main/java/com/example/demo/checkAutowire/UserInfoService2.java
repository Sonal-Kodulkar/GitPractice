package com.example.demo.checkAutowire;

import org.springframework.stereotype.Component;

@Component
 class UserInfoService2 {
 private String msg2;

 public String getMsg2() {
  return msg2;
 }

 @Override
 public String toString() {
  return "UserInfoService2{" +
          "msg2='" + msg2 + '\'' +
          '}';
 }

 public String setMsg2(String msg2) {
  this.msg2 = msg2;
  return msg2;
 }
}
