package com.hive.portfolioapi;

import org.springframework.boot.SpringApplication;

public class TestPortfolioApiApplication {

    public static void main(String[] args) {
        SpringApplication.from(PortfolioApiApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
