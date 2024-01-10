package domain.driven.specification;

import java.util.List;
import java.util.stream.Collectors;

public class ProductFilter {
    public List<Product> filter(List<Product> products, Specification<Product> spec) {
        return products.stream().filter(spec::isSatisfiedBy).collect(Collectors.toList());
    }
}