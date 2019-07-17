package com.apollo.cn;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

@EnableEurekaClient
@SpringBootApplication
@Configuration
@EnableApolloConfig
public class ApollodemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApollodemoApplication.class, args);
    }

}
