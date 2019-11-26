package xing.rujuan.aop.terms;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Before("execution(* *(..))")
    public void logBefore(){
        System.out.println("logging before method being executed....");
    }
}
