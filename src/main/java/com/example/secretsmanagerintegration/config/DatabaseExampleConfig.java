package com.example.secretsmanagerintegration.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseExampleConfig {

//    @Autowired
//    AwsSecretsManagerMapper awsSecretsManagerMapper;

    @Bean
    public void dataSource(AwsSecretsManagerMapper awsSecretsManagerMapper) {

        System.out.println(awsSecretsManagerMapper.getUsername());
        System.out.println(awsSecretsManagerMapper.getPassword());
    }
}
