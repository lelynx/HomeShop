package com.lelynx.homeshop;

import com.lelynx.homeshop.delivery.Delivery;

import java.util.HashMap;
import java.util.Map;

public class Bill {
    private Customer customer;

    private Map<Product, Integer> products = new HashMap<>();
//    Attention: une Map n'accepte que des objets, et pas des
//    des types primitifs. Donc: Integer et pas int

    // CTor
    public Bill(Customer customer, Delivery delivery) {

        this.customer = customer;
    }

    public void addProduct(Product product, int quantity) {
        products.put(product, quantity);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }


}
