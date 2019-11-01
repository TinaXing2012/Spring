package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("javaconfig")
public class AppConfig {

    @Bean(name="cust", initMethod = "customInit", destroyMethod = "customDestory")
    public Customer customer(){
        return new Customer();
    }
}
