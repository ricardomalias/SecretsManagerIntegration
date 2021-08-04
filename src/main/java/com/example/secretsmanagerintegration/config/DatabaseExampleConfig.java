package com.example.secretsmanagerintegration.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseExampleConfig {

    @Autowired
    AwsSecretsManager awsSecretsManager;

    @Bean
    public void dataSource() {

        System.out.println(awsSecretsManager.getUsername());
        System.out.println(awsSecretsManager.getPassword());
    }
}
