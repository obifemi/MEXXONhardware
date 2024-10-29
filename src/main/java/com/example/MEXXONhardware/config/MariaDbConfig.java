package com.example.MEXXONhardware.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import javax.sql.DataSource;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class MariaDbConfig {

    @Bean
    @Primary
    public DataSource mariaDbDataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl("jdbc:mariadb://localhost:3307/hardware_mariadb_db");
        dataSource.setUsername("admin");
        dataSource.setPassword("admin");
        return dataSource;
    }
}