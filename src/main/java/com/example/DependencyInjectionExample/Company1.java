package com.example.DependencyInjectionExample;

import org.springframework.stereotype.Component;

@Component
public class Company1 implements Company{

    public void showName() {
        System.out.print("This is company 1");
    }
}
