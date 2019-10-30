package xing.rujuan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xing.rujuan.EmailService;

@Configuration
public class AppConfig {

    @Bean
    public EmailService emailService(){
        return new EmailService();
    }

}
