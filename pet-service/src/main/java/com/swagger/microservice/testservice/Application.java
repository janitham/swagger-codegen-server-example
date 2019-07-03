package com.swagger.microservice.testservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

        /*ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        final PetApi api = (PetApi) context.getBean("petApi");
        api.findPetsByStatus(Arrays.asList("sold")).stream().forEach(System.out::println);

        ((ConfigurableApplicationContext) context).close();*/
    }

}
