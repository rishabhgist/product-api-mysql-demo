package com.jap.product.service;

import com.jap.product.domain.Product;
import com.jap.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    private ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        return null;
    }

    @Override
    public List<Product> getAllProduct() {
        return null;
    }

    @Override
    public List<Product> getProductByName(String name) {
        return null;
    }
}
