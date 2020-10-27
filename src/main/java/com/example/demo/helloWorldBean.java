package com.example.demo;

class HelloWorldBean {
    private  String msg;

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "helloWorldBean{" +
                "msg='" + msg + '\'' +
                '}';
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public HelloWorldBean(String msg) {
        this.msg = msg;
    }
}
