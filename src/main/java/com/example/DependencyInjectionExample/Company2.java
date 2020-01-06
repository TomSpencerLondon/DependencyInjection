package com.example.DependencyInjectionExample;

import org.springframework.stereotype.Component;

@Component
public class Company2 implements Company {

    public void showName() {
        System.out.print("This is company 2");
    }
}