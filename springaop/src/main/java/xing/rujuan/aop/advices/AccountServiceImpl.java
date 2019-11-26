package xing.rujuan.aop.advices;

import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    public void deposit(double amount) {
        System.out.println("Deposit successfully: " + amount);
    }
}
