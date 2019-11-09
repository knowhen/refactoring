package com.when.refactoring.chapter6;

/**
 * @author: when
 * @create: 2019-11-09  11:20
 **/
public class IntroduceExplainingVariable {
    private int quantity;
    private int itemPrice;

    double price() {
        // price is base price - quantity discount + shipping
        return quantity * itemPrice
                - Math.max(0, quantity - 500) * itemPrice * 0.05
                + Math.min(quantity * itemPrice * 0.1, 100);
    }

    double priceV1() {
        return basePrice() - quantityDiscount() + shipping();
    }

    private double shipping() {
        return Math.min(basePrice() * 0.1, 100);
    }

    private double quantityDiscount() {
        return Math.max(0, quantity - 500) * itemPrice * 0.05;
    }

    private int basePrice() {
        return quantity * itemPrice;
    }

}
