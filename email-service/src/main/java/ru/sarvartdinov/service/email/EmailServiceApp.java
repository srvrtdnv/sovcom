package ru.sarvartdinov.service.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmailServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(EmailServiceApp.class, args);
    }

}
