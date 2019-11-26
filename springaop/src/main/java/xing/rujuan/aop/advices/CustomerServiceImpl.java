package xing.rujuan.aop.advices;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    public void doSomething() {
        System.out.println("Do Something in CustomerServiceImpl...");
    }

    public String getName() {
        return "Miss Xing";
    }

    public String getAge() {
        throw new MyException("my exception...");
    }

    public double calculatePayment(double rate, int hours) {
        System.out.println("Rate: " + rate + ", hours: " + hours);
        return rate * hours;
    }
}
