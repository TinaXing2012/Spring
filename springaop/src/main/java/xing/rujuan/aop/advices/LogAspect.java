package xing.rujuan.aop.advices;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Before("execution(* *(..))")
    public void logBefore(){
        System.out.println("Log before executing....");
    }

    @After("execution(* xing.rujuan.aop.advices.CustomerService.*(..))")
    public void logAfter(){
        System.out.println("Log After executing---");
    }
}
