package com.example.travelagency1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement //activating support for @Transactional methods
public class TravelAgency1Application {

    public static void main(String[] args) {
        SpringApplication.run(TravelAgency1Application.class, args);
    }

}
