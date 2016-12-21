package com.att.vtm;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:application-context.xml")
public class RestService {
    private static final Logger logger = LoggerFactory.getLogger(RestService.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RestService.class, args);
    }

}
