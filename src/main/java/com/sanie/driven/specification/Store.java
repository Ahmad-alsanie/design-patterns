package com.sanie.driven.specification;

import java.util.List;

public class Store {
    public static void main(String[] args) {
        List<Product> products = List.of(new Product());
        ProductFilter filter = new ProductFilter();

        Specification<Product> redColorSpec = new ColorSpecification("red");
        Specification<Product> belowPriceSpec = new PriceSpecification(100.00);

        // Combine specifications
        Specification<Product> redAndCheapSpec = redColorSpec.and(belowPriceSpec);

        List<Product> redAndCheapProducts = filter.filter(products, redAndCheapSpec);
    }
}
