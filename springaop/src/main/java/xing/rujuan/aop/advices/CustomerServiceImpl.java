package xing.rujuan.aop.advices;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    public void doSomething() {
        System.out.println("Do Something in CustomerServiceImpl...");
    }
}
