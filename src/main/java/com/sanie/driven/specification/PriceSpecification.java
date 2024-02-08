package com.sanie.driven.specification;

public class PriceSpecification implements Specification<Product> {
    private double maxPrice;

    public PriceSpecification(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    @Override
    public boolean isSatisfiedBy(Product product) {
        return product.getPrice() <= maxPrice;
    }
}