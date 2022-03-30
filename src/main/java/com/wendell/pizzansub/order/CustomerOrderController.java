package com.wendell.pizzansub.order;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerOrderController {
    private final CustomerOrderRepository repository;

    public CustomerOrderController(CustomerOrderRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/orders")
    List<CustomerOrder> all() {
        return repository.findAll();
    }

    @PostMapping("/orders")
    CustomerOrder newCustomerOrder(@RequestBody CustomerOrder order) {
        return repository.save(order);
    }

    @GetMapping("/orders/{id}")
    CustomerOrder one(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new CustomerOrderNotFoundException(id));
    }

    @PutMapping("orders/{id}")
    CustomerOrder replaceCustomerOrder(@RequestBody CustomerOrder customerOrder, @PathVariable Long id) {
        return repository.findById(id)
                .map(order -> {
                    order.setCustomerName(customerOrder.getCustomerName());
                    order.setContact(customerOrder.getContact());
                    order.setDeliveryDate(customerOrder.getDeliveryDate());
                    order.setDeliveryAddress(customerOrder.getDeliveryAddress());
                    order.setType(customerOrder.getType());
                    order.setFood(customerOrder.getFood());
                    order.setToppings(customerOrder.getToppings());

                    return repository.save(order);
                })
                .orElseGet(() -> {
                    customerOrder.setId(id);
                    return repository.save(customerOrder);
                });
    }

    @DeleteMapping("orders/{id}")
    void deleteCustomerOrder(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
