package xing.rujuan.aop.sequence;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect1 {

    @Before("execution(* *(..))")
    public void log1(){
        System.out.println("Log...1 in LogAspect1.....");
    }

    @Before("execution(* *(..))")
    public void abc(){
        System.out.println("Log...abc in LogAspect1.....");
    }

}
