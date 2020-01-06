package com.example.DependencyInjectionExample;

import org.springframework.beans.factory.annotation.Autowired;

public class Programmer {
    @Autowired
    static Company company;


    public Programmer(Company company) {
        this.company = company;
    }

    public Programmer() {
    }


    public static Company getCompany() {
        return company;
    }



    public static void setCompany(Company company) {
        Programmer.company = company;
    }



    public static void showMyCompany() {
        company.showName();
    }
}
