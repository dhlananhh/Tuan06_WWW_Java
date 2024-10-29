package iuh.fit.se.resources;

import iuh.fit.se.resources.ClientBean;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
@ComponentScan(basePackages = "iuh.fit.se.resources")
public class AppConfig {

    @Bean
    public Resource myResource() throws IOException {
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        return resolver.getResource("classpath:sample.txt");
    }

    @Bean
    public ClientBean clientBean(Resource myResource) {
        return new ClientBean(myResource, null);
    }
}