package xing.rujuan.config;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebApplicationContextConfig implements WebMvcConfigurer {

    //<mvc:default-servlet-handler />

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    //<mvc:resources mapping="/abc/**" location="/resources/" />
    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/abc/**").addResourceLocations("/resources/");
    }

}
