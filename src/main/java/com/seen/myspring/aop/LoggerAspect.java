package com.seen.myspring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggerAspect {
    @Before("execution(public int com.seen.myspring.util.CalImpl.*(..))")
    public void before(JoinPoint joinPoint){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        //获取参数列表
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println(name+"的参数是："+args);
    }

    @After("execution(public int com.seen.myspring.util.CalImpl.*(..))")
    public void after(JoinPoint joinPoint){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法之后");
    }

    @After("execution(public int com.seen.myspring.util.CalImpl2.sub(..))")
    public void after2(JoinPoint joinPoint){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法之后");
    }

    @AfterReturning(value = "execution(public int com.seen.myspring.util.CalImpl.*(..))",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法的结果是："+result);
    }

    @AfterThrowing(value = "execution(public int com.seen.myspring.util.CalImpl.*(..))",throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint,Exception exception){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法抛出异常："+exception);
    }


    @Around("execution(public int com.seen.myspring.util.CalImpl.add(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("我是环绕通知-前");
        String name = proceedingJoinPoint.getSignature().getName();
        Object proceed = proceedingJoinPoint.proceed();

        System.out.println(name+"我是环绕通知-后");
        return proceed;
    }


}
