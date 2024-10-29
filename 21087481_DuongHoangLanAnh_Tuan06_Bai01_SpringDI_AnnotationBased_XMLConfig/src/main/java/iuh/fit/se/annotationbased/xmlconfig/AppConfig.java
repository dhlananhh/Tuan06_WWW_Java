package iuh.fit.se.annotationbased.xmlconfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import iuh.fit.se.annotationbased.xmlconfig.entities.Group;
import iuh.fit.se.annotationbased.xmlconfig.entities.User;


@Configuration
@ComponentScan(basePackages = "iuh.fit.se.annotationbased.xmlconfig")
public class AppConfig {

    @Autowired
    private Group group;

    @Bean
    public User user() {
        return new User(1, "user01", "password01", group);
    }

    @Bean
    public Group group() {
        return new Group(1, "Group 01");
    }
}