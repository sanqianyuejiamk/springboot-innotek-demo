package com.mengka.springboot;

import com.innotek.microservice.config.BaseConfig;
import com.innotek.microservice.config.annotation.EnableInnotekMicroService;
import com.innotek.microservice.server.MicroService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * Created with IntelliJ IDEA
 * User: huangyy
 * Date: 2016/11/26
 * Time: 13:36
 */
@EnableInnotekMicroService(name = "mengka-service")
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@PropertySource("classpath:/properties/datasource.properties")
@ImportResource("classpath:/spring/applicationContext.xml")
public class SpringBootMonitorStart extends BaseConfig {

    public static void main(String[] args) {
        System.setProperty("logging.path", "/Users/hyy044101331/logs/spring-boot2");

        String userHome = System.getProperty("user.home");
        System.out.println("-------, user.home: " + userHome);

        String logPath = System.getProperty("logging.path");
        System.out.println("-------, logging.path: " + logPath);

        SpringBootMonitorStart service = new SpringBootMonitorStart();
        service.start(args);
    }

    @Override
    public String serviceName() {
        return "mengka-service";
    }
}
