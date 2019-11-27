package xing.rujuan.aop.sequence;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect2 {

    @Before("execution(* *(..))")
    public void log1(){
        System.out.println("Log...1 in LogAspect2.....");
    }

    @Before("execution(* *(..))")
    public void zz(){
        System.out.println("Log...zz in LogAspect2.....");
    }

}
