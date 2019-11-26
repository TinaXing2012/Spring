package xing.rujuan.aop.proxy;

public class CustomerServiceProxy extends CustomerService {

    public void doSomething(){
        LoggerAspect loggerAspect = new LoggerAspect();
        loggerAspect.logBefore();

        super.doSomething();

        loggerAspect.logAfter();
    }
}
