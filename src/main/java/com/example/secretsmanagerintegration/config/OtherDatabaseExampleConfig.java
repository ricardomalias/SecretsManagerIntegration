package com.example.secretsmanagerintegration.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OtherDatabaseExampleConfig {

    @Autowired
    AwsSecretsManagerMapper awsSecretsManagerMapper;

    @Bean
    public void otherDataSource() {

//            AwsSecretsManagerMapper secret = awsSecretsManager.getSecret();
            System.out.println(awsSecretsManagerMapper.getUsername());
            System.out.println(awsSecretsManagerMapper.getPassword());
    }
}