package me.rerun.karafcxf.service.impl;

public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, "+name;
    }

}
