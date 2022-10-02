package com.spring.ex01;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable
    {
        System.out.println("[메서드 호출 전 : LogginAdvice");
        System.out.println(invocation.getMethod() + "메서드 호출 전");
        Object object = invocation.proceed(); // invocation을 사용해 메서드를 호출한다.
        System.out.println("[메서드 호출 후 : LogginAdvice");
        System.out.println(invocation.getMethod() + "메서드 호출 후");
        return object;
    }
}
