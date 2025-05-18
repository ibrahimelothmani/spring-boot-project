package com.ibrahim.store;

import org.springframework.boot.SpringApplication;

public class TestStoreApplication {

    public static void main(String[] args) {
        SpringApplication.from(StoreApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
