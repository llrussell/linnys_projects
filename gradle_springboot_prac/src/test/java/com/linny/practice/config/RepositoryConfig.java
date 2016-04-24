package com.linny.practice.config;

/**
 * Created by russelll on 4/24/16.
 */
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.linny.practice.database.entity"})
@EnableJpaRepositories(basePackages = {"com.linny.practice.database.repository"})
@EnableTransactionManagement
public class RepositoryConfig {
}