package com.wendell.pizzansub.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(CustomerOrderRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new CustomerOrder(
                    "Wendell Soriano",
                    "09212843062",
                    new Date(),
                    "Calzadang Bayu",
                    "pickup",
                    "pizza",
                    "Black Olives, Pineapple"
            )));

            log.info("Preloading " + repository.save(new CustomerOrder(
                    "Rozil Soriano",
                    "09222465672",
                    new Date(),
                    "Balibago City",
                    "delivery",
                    "sub",
                    "Black Olives, Pineapple"
            )));

            log.info("Preloading " + repository.save(new CustomerOrder(
                    "Amaranthine Soriano",
                    "09224543672",
                    new Date(),
                    "Balibago City",
                    "pickup",
                    "sub",
                    "Black Olives, Pineapple"
            )));
        };
    }
}

