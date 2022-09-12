package com.d4;

import com.d2.UserService;
import com.d2.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
       //真实角色
        UserServiceImpl userService =new UserServiceImpl();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService); //设置代理对象
        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        proxy.delete();
    }
}
