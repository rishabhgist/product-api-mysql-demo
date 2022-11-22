package com.jap.product.controller;

import com.jap.product.domain.Product;
import com.jap.product.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/post")
    public ResponseEntity<?> save(@RequestBody Product product){
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }
    @GetMapping("/products")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(productService.getAllProduct(), HttpStatus.OK);
    }

    @GetMapping("/product/{name}")
    public ResponseEntity<?> getByName(@PathVariable String name){
        return new ResponseEntity<>(productService.getProductByName(name), HttpStatus.OK);
    }
}
