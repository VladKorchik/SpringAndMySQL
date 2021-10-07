package ru.netology.SpringAndMySQL.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.SpringAndMySQL.repository.Repository;
import ru.netology.SpringAndMySQL.service.GetService;

@Configuration
public class JavaConfig {

    @Bean
    public Repository repository() {
        return new Repository();
    }

    @Bean
    public GetService getService(Repository repository) {
        return new GetService(repository());
    }
}
