package xing.rujuan.aop.terms;

import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl implements CustomerService {

    public void doSomething() {
        System.out.println("Do Something in CustomerServiceImpl...");
    }
}
