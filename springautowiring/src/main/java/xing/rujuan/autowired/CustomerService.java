package xing.rujuan.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

//    @Autowired(required = false)
    @Autowired
    @Qualifier("custDao")
    private CustomerDao customerDao;

    public CustomerService(){
        System.out.println("default constructor....");
    }

//    @Autowired
    public CustomerService(CustomerDao customerDao) {
        System.out.println("customized constructor....");
        this.customerDao = customerDao;
    }

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

//    @Autowired
    public void setCustomerDao(CustomerDao customerDao) {
        System.out.println("setter...");
        this.customerDao = customerDao;
    }
}
