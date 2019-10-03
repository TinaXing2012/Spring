package xing.rujuan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import xing.rujuan.formatter.PhoneFormatter;
import xing.rujuan.model.Phone;

@Configuration
@EnableWebMvc
@ComponentScan("xing.rujuan")
public class WebApplicationContextConfig implements WebMvcConfigurer {

    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    public void addFormatters(FormatterRegistry registry) {

        registry.addFormatter(new PhoneFormatter());
    }
}
