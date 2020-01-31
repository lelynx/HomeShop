package com.lelynx.homeshop.delivery;

public class RelayDelivery implements Delivery {

    private int numero;

    public RelayDelivery(int numero) {
        this.numero = numero;
    }

    @Override
    public double getPrice() {
        double price;
        if (numero >= 1 && numero <= 22) {
            price = 0.00;
        } else if (numero >= 23 && numero <= 47) {
            price = 2.99;
        } else {
            price = 4.99;
        }
        return price;
    }
}
