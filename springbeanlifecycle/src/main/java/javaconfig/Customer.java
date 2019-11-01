package javaconfig;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Customer {

    public Customer() {
        System.out.println("Default Constructor......");
    }

    @PostConstruct
    public void customInit(){
        System.out.println("Custom init.....");
    }

    @PreDestroy
    public void customDestory(){
        System.out.println("Custom destory.....");
    }

}
