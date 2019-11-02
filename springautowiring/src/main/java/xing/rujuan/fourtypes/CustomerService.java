package xing.rujuan.fourtypes;

public class CustomerService {

    private CustomerDao customerDao;

    public CustomerService() {
        System.out.println("default constructor...");
    }

    public CustomerService(CustomerDao custDao) {
        System.out.println("Customized constructor------");
        this.customerDao = custDao;
    }

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        System.out.println("setter....");
        this.customerDao = customerDao;
    }
}
