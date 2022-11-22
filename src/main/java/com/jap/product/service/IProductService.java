package com.jap.product.service;

import com.jap.product.domain.Product;

import java.util.List;

public interface IProductService {
    Product saveProduct(Product product);
    List<Product> getAllProduct();
    List<Product> getProductByName(String name);
}
