package xing.rujuan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import xing.rujuan.EmailService;

@Configuration
public class AppConfig {

    @Bean
    public EmailService emailService(){
        return new EmailService();
    }

    @Bean
    @Scope("prototype")
    public EmailService prototypeEmailService(){
        return new EmailService();
    }

}
