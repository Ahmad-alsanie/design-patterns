package com.sanie.driven.specification;

public class ColorSpecification implements Specification<Product> {
    private String color;

    public ColorSpecification(String color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfiedBy(Product product) {
        return product.getColor().equalsIgnoreCase(color);
    }
}
