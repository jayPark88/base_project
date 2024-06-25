package com.jaypark8282.base.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "com.jaypark8282.core.jpa")
@EnableJpaRepositories(basePackages = "com.jaypark8282.core.jpa")
public class JpaConfig {

}
