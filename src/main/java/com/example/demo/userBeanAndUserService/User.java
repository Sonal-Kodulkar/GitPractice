package com.example.demo.userBeanAndUserService;

import java.util.Date;

public class User {

    private String name;
    private Date date;
    private Integer id;

    protected User()
    {

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }



    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User(Integer id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }




}
