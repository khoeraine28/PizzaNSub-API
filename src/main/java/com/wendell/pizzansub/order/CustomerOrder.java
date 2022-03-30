package com.wendell.pizzansub.order;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class CustomerOrder {
    private @Id @GeneratedValue Long id;
    private String customerName;
    private String contact;
    private Date deliveryDate;
    private String deliveryAddress;
    private String type;
    private String food;
    private String toppings;

    public CustomerOrder() {
    }

    public CustomerOrder(String customerName, String contact, Date deliveryDate, String deliveryAddress, String type, String food, String toppings) {
        this.customerName = customerName;
        this.contact = contact;
        this.deliveryDate = deliveryDate;
        this.deliveryAddress = deliveryAddress;
        this.type = type;
        this.food = food;
        this.toppings = toppings;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "CustomerOrder{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", contact='" + contact + '\'' +
                ", deliveryDate=" + deliveryDate +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", type='" + type + '\'' +
                ", food='" + food + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
