package xing.rujuan.aop.sequence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        AccountService accountService = context.getBean(AccountService.class);
        accountService.deposit(100);
    }
}
