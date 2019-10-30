package xing.rujuan;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import xing.rujuan.config.AppConfig;

public class Main {

    public static void main(String[] args) {
//        EmailService emailService = new EmailService();
//        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
//        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        EmailService emailService = context.getBean("emailService", EmailService.class);
        System.out.println(emailService);
        emailService.sendEmail("test@gmail.com", "Hello from Miss Xing!");

        ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
        EmailService emailService1 = context1.getBean("emailService", EmailService.class);
        System.out.println(emailService1);
        emailService1.sendEmail("test1@gmail.com", "Hi");
    }
}
