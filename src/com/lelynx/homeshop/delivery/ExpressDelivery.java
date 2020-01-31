package com.lelynx.homeshop.delivery;

public class ExpressDelivery implements Delivery {

    private String city;

    public ExpressDelivery(String city) {
        this.city = city;
    }

    @Override
    public double getPrice() {
        double price;
        if (!city.equals("Paris")) {
            price = 6.99;
        } else {
            price = 9.99;
        }
        return price;
    }
}
