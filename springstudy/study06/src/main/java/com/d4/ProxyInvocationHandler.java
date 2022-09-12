package com.d4;

import com.d3.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private  Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成得到代理类
    public Object getProxy(){
      return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    //处理代理实例，并返回结果
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result=method.invoke(target,args);

        return result;
    }
    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }

}
