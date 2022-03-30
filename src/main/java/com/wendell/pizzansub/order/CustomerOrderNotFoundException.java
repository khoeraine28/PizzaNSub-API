package com.wendell.pizzansub.order;

public class CustomerOrderNotFoundException extends RuntimeException {
    CustomerOrderNotFoundException(Long id) {
        super("Could not find order " + id);
    }
}
