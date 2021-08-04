package com.example.secretsmanagerintegration.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OtherDatabaseExampleConfig {

    @Autowired
    AwsSecretsManager awsSecretsManager;

    @Bean
    public void otherDataSource() {

//            AwsSecretsManagerMapper secret = awsSecretsManager.getSecret();
            System.out.println(awsSecretsManager.getUsername());
            System.out.println(awsSecretsManager.getPassword());
    }
}