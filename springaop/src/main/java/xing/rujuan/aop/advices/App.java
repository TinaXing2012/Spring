package xing.rujuan.aop.advices;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        CustomerService customerService = context.getBean(CustomerService.class);
//        customerService.doSomething();
//
//        System.out.println("\n");
//
//        AccountService accountService = context.getBean(AccountService.class);
//        accountService.deposit(1000.00);

//        String returnName = customerService.getName();
//        System.out.println(returnName);
        customerService.getAge();
    }
}
