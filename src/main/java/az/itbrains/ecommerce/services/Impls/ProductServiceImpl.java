package az.itbrains.ecommerce.services.Impls;

import az.itbrains.ecommerce.repositories.ProductRepository;
import az.itbrains.ecommerce.services.ProductService;


public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
