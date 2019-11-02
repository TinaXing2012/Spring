package xing.rujuan.fourtypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-fourtypes.xml");
        CustomerService customerService = context.getBean("customerService", CustomerService.class);
        System.out.println(customerService.getCustomerDao());

    }
}
