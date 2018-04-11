package com.csimplifyit.talentNest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.csimplifyit.talentNest.model"})
@EnableJpaRepositories(basePackages = {"com.csimplifyit.talentNest.repository"})
@EnableTransactionManagement
public class JpaConfiguration extends JpaRepositoriesAutoConfiguration {

}
