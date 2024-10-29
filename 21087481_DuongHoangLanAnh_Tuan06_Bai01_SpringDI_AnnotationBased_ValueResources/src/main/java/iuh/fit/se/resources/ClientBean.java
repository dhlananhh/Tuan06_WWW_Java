package iuh.fit.se.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

@Configuration
@ComponentScan(basePackages = "iuh.fit.se.resources")
@PropertySource("classpath:application.properties")
public class ClientBean {

    @Value("${foo.permission}")
    private String permission;

//    @Value("classpath:beans.xml")
    private Resource myResource;

    public ClientBean(@Value("${foo.resource}") Resource myResource, String permission) {
        this.myResource = myResource;
        this.permission = permission;
    }

    public void doSomething() throws IOException {
        File file = myResource.getFile();
        byte[] content = Files.readAllBytes(file.toPath()); // Sử dụng Files.readAllBytes()
//        String s = new String(content, file.getPath());
        String s = new String(content, StandardCharsets.UTF_8);
        System.out.println(s);
        System.out.println(permission);
    }
}