package com.kou.utils;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author JIAJUN KOU
 *
 * 用于记录日志的工具类：里边有公共的代码
 */
public class Logger {

    /**
     * 前置通知
     * 用于打印日志，让其在切入点方法执行之前执行
     * （切入点方法就是业务层方法）
     */
    public void beforeprintLog(){
        System.out.println("前置通知。。。。。。");
    }

    /**
     * 后置通知
     */
    public void afterReturningPrintLog(){
        System.out.println("后置通知。。。。。。");
    }

    /**
     * 异常通知
     */
    public void afterThrowingPrintLog(){
        System.out.println("异常通知。。。。。。");
    }

    /**
     * 最终通知
     */
    public void afterPrintLog(){
        System.out.println("最终通知。。。。。。");
    }

    /**
     * 环绕通知
     *     spring框架为我们提供了一个接口 ProceedingJoinPoint 该接口明确切入点方法。
     *
     */
    public Object aroundPrintLog(ProceedingJoinPoint pjp){
        Object rtValue=null;
        try{
            //得到方法执行所需的参数
            Object[] args=pjp.getArgs();
            System.out.println("around执行了。。。。。。");
            rtValue=pjp.proceed(args);//明确调用业务层方法
            System.out.println("around执行了。。。。。。");

            return rtValue;

        }catch (Throwable t){
            System.out.println("around执行了。。。。。。");

            throw new RuntimeException(t);
        }finally {
            System.out.println("around执行了。。。。。。");

        }

    }
}
