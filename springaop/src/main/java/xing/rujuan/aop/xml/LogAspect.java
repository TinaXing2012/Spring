package xing.rujuan.aop.xml;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @After("execution(* *(..))")
    public void logAfter(){
        System.out.println("Logging after method invoked....");
    }

}
