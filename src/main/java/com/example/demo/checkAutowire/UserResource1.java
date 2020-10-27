package com.example.demo.checkAutowire;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource1 {
    @Autowired
    public UserInfoService1 userInfoService1;

    @Autowired
    public UserInfoService2 userInfoService2;

    @GetMapping(path ="/user1")
    public String getUserService1()
    {
       String message= userInfoService1.setMsg("This is userinfoservice1");
       return message;
    }

    @GetMapping(path ="/user2")
    public String getUserService2()
    {
        String message1= userInfoService2.setMsg2("This is userinfoservice2");
        return message1;
    }

    @GetMapping(path="/add")
    public Integer addition(@RequestParam(value = "t1",required = true) int i,@RequestParam("t2") int j)
    {
//        if(i==null) {i=0; }

        int k=i+j;
        return k;
    }
}
