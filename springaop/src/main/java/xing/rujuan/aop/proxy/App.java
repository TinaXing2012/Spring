package xing.rujuan.aop.proxy;

public class App {

    public static void main(String[] args){
        FancyBeanFactory beanFactory = new FancyBeanFactory();
        CustomerService customerService = (CustomerService) beanFactory.getBean("customerService");
        customerService.doSomething();
    }
}
