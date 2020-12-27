package org.sid.costumerservice;

import org.sid.costumerservice.entities.Costumer;
import org.sid.costumerservice.repositories.costumerrepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CostumerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CostumerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(costumerrepository costumerrepository){

       return args -> {


           costumerrepository.save(new Costumer(null,"yassine","yassine@gmail.com"));
           costumerrepository.save(new Costumer(null,"mohamed","mohamed@gmail.com"));
           costumerrepository.save(new Costumer(null,"ayoub","ayoub@gmail.com"));

       };
    }

}
