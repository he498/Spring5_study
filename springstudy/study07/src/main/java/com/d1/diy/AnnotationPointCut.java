package com.d1.diy;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.d1.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("======方法执行前======");
    }
    @After("execution(* com.d1.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("======方法执行后======");
    }

    @Around("execution(* com.d1.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        Signature signature = jp.getSignature(); //获得签名
        System.out.println("signature:"+signature);
        Object proceed = jp.proceed();  //执行方法
        System.out.println("环绕后");

    }

}
