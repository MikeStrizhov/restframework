package com.mgs.restframework;

import com.mgs.restframework.services.RestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.mgs.restframework")
public class RestFrameworkApp {
    private static final Logger logger = LoggerFactory.getLogger(RestFrameworkApp.class);

    @Autowired
    RestService restService;

    public static void main(String[] args){

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(RestFrameworkApp.class);

//        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        RestFrameworkApp app = ctx.getBean(RestFrameworkApp.class);
        app.run();


    }

    private void run() {
        logger.info("RestFrameworkApp started");
        restService.executeGetByUrl("https://petstore.swagger.io/v2/pet/findByStatus?status=available");
    }
}
