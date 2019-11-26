package xing.rujuan.aop.advices;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("xing.rujuan.aop.advices")
@EnableAspectJAutoProxy
public class Config {
}
